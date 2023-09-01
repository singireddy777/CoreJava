//package com.example.helloworld.model;
//
//public class TeamArea {
//
//	public ResponseEntity<?> getProjectMemeberByAlmId(String ticketid, String prRaisedUser) {
//		ResponseEntity<?> response = getALMDetailsById(ticketid);
//		HttpResponse httpResponse = null;
//		List<String> membersList = new ArrayList<>();
//		if (response != null && !response.toString().isEmpty()) {
//			ALMTicket aLMTicket = (ALMTicket) response.getBody();
//			String projectAreaName = aLMTicket.getProjectArea();
//			String teamAreaName = aLMTicket.getTeamArea();
//			if (projectAreaName != null && !projectAreaName.isEmpty()) {
//				try {
//					if (almLogin()) {
//						httpResponse = Getmembers("projectareas", projectAreaName);
//						int statusCode = httpResponse.getStatusLine().getStatusCode();
//
//						if (statusCode == 200) {
//							Header header = httpResponse.getFirstHeader(ALMConstants.FORM_AUTH_HEADER);
//							if ((header != null) && (header.getValue().equals(ALMConstants.FORM_AUTH_REQUIRED_MSG)))
//								return ResponseEntity.ok()
//										.body(ALMConstants.ERROR_MSG + " " + ALMConstants.AUTH_FAILED_MSG);
//
//							else {
//								almUser = almReponseParser.memberResponseProcess(httpResponse, prRaisedUser);
//								if (almUser.isProjectMember() == false) {
//									httpResponse = Getmembers("teamareas", teamAreaName);
//									almUser = almReponseParser.memberResponseProcess(httpResponse, prRaisedUser);
//								}
//							}
//							log.info("ALM user Model details: " + almUser.toString());
//						}
//
//						else if (statusCode == 404 || statusCode == 400)
//							return ResponseEntity.ok().body(
//									"Unable to find item" + " " + ticketid + ". " + ALMConstants.INVALID_ITEM_MSG);
//					}
//				} catch (NullPointerException | InvalidCredentialsException | UnsupportedOperationException
//						| ParseException | IOException e) {
//					log.error(ALMConstants.ERROR_MSG + "due to:" + " ", e.getMessage());
//				}
//
//			} else
//				return ResponseEntity.ok().body("the projectAreaName is not available:");
//		} else
//			return ResponseEntity.ok().body("The getItem API response is not available:");
//		return ResponseEntity.ok().body(almUser);
//	}
//
//	public ALMPullRequestUser memberResponseProcess(HttpResponse httpResponse, String prRaisedUser) {
//
//		List<String> membersList = new ArrayList<>();
//		try {
//			HttpEntity entity = httpResponse.getEntity();
//			String MemberResponse = EntityUtils.toString(entity);
//			JsonNode jsonResponseNode;
//
//			jsonResponseNode = objectMapper.readTree(MemberResponse);
//
//			almUser.setProjectAreaId(jsonResponseNode.get("rdf:resource").asText());
//			almUser.setProjectAreaName(jsonResponseNode.get("dc:title").asText());
//			JsonNode rtcMembers = jsonResponseNode.get("rtc_cm:members");
//
//			if (rtcMembers != null && !rtcMembers.isEmpty() && rtcMembers.isArray()) {
//				for (JsonNode element : rtcMembers) {
//					String[] value = element.get("rdf:resource").asText().split("/");
//					membersList.add(value[value.length - 1]);
//				}
//				for (String Member : membersList) {
//
//					if (Member.equalsIgnoreCase(prRaisedUser))
//						almUser.setProjectMember(true);
//					else
//						almUser.setProjectMember(false);
//				}
//			}
//		} catch (ParseException | IOException e) {
//			log.info("Error occurred while processing get member response:" + e.getMessage());
//		}
//		return almUser;
//	}
//
//	public HttpResponse Getmembers(String type, String id) {
//
//		URI uri;
//		HttpResponse httpResponse = null;
//		try {
//			HttpGet httpGet = new HttpGet();
//			uri = new URI(ALMConstants.ALM_PROJECT_URL + type + "/" + id);
//			httpGet.setURI(uri);
//			httpGet.addHeader(ALMConstants.HEADER_TYPE_ACCEPT, ALMConstants.HEADER_VALUE_APPL_JSON);
//			httpResponse = httpClient.execute(httpGet);
//		} catch (IOException | URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return httpResponse;
//	}
//
//}

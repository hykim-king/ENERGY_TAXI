package com.pcwk.ehr.chat.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.pcwk.ehr.chat.domain.ChatVO;
import com.pcwk.ehr.chat.service.ChatService;
import com.pcwk.ehr.cmn.MessageVO;
import com.pcwk.ehr.user.domain.UserVO;

@Controller
@RequestMapping("chat")
public class ChatController {

	@Autowired
	private ChatService chatService;
	
	@GetMapping("/sendChat_index.do")
	public String sendChatIndex(){
		String viewName = "chat/chat";
		
		return viewName;
	}
		
	
	@PostMapping("/sendChat.do")
	public String sendChat(HttpSession session,ChatVO param,int userId) throws SQLException{
		String jsonString;
		
		String content = param.getContent();
		ChatVO inVO = new ChatVO();
		UserVO user = (UserVO)session.getAttribute("user");
		int senderId = user.getUserId();
		int userIdparam = userId;
		inVO.setSenderId(senderId);
		inVO.setReceiverId(userIdparam);
		inVO.setContent(content);
		
		System.out.println("inVO.getSenderId()" + inVO.getSenderId());
		System.out.println("inVO.getReceiverId()" + inVO.getReceiverId());
		System.out.println("inVO.getContent()" + inVO.getContent());
		System.out.println("userIdparam" + userIdparam);
		
		int flag = chatService.sendChat(inVO);
		
		String message = "";
		
		if(flag == 1) {
			message = param.getSenderId() + "님 메시지 전송에 성공하였습니다.";
		} else {
			message = param.getSenderId() + "님 메시지 전송에 실패하였습니다.";
		}
		
		MessageVO messageVO = new MessageVO(flag, message);
		
		jsonString = new Gson().toJson(messageVO);
		
		return jsonString;		
	}
}

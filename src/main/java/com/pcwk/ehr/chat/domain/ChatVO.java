package com.pcwk.ehr.chat.domain;

public class ChatVO {

	private int messageId;
	private int receiverId;
	private String content;
	private String timestamp;
	private int senderId;
	
	public ChatVO() {

	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	@Override
	public String toString() {
		return "MessageVO [messageId=" + messageId + ", receiverId=" + receiverId + ", content=" + content
				+ ", timestamp=" + timestamp + ", senderId=" + senderId + "]";
	}
	
}

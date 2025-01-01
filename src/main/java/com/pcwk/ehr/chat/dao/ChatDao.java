package com.pcwk.ehr.chat.dao;

import java.sql.SQLException;

import com.pcwk.ehr.chat.domain.ChatVO;

public interface ChatDao {

	int sendChat(ChatVO inVO) throws SQLException;
}

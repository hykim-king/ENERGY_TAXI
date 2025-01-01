package com.pcwk.ehr.chat.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pcwk.ehr.chat.domain.ChatVO;

@Repository
public class ChatDaoImpl implements ChatDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public ChatDaoImpl() {

	}
	
	private RowMapper<ChatVO> chatMapper = new RowMapper<ChatVO>() {
		
		@Override
		public ChatVO mapRow(ResultSet rs, int rowNum) throws SQLException{
			ChatVO outVO = new ChatVO();
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			outVO.setMessageId(rs.getInt("message_id"));
			outVO.setReceiverId(rs.getInt("message_receiver_id"));
			outVO.setContent(rs.getString("message_content"));
			outVO.setTimestamp(rs.getString("message_timestamp"));
			outVO.setSenderId(rs.getInt("message_sender_id"));
			
			return outVO;
		}
	};
	
	@Override
	public int sendChat(ChatVO inVO) throws SQLException{
		
		int flag = 0;
		StringBuilder sb = new StringBuilder(200);
		
		sb.append("INSERT INTO message (     \n");
		sb.append("	    message_receiver_id, \n");
		sb.append("	    message_content,     \n");
		sb.append("	    message_timestamp,   \n");
		sb.append("	    message_sender_id    \n");
		sb.append("	) VALUES (               \n");
		sb.append("	    ?,                   \n");
		sb.append("	    ?,                   \n");
		sb.append("	    SYSDATE,             \n");
		sb.append("	    ?)                   \n");

        
        Object [] args = {inVO.getReceiverId(), inVO.getContent(), inVO.getSenderId()};
	
        flag = this.jdbcTemplate.update(sb.toString(),args);
        
		return flag;
	}
}

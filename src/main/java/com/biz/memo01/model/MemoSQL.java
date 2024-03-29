package com.biz.memo01.model;

public class MemoSQL {
	public static final String MEMO_SELECT_ALL=" SELECT * FROM tbl_memo ";
	
	public static final String MEMO_FIND_BY_ID
	= " SELECT * FROM tbl_memo WHERE id= #{id} ";
	
	public static final String MEMO_INSERT
	= " INSERT INTO tbl_memo(id,m_auth, m_date, m_subject, m_text )"
			+ " VALUES(#{id},#{m_auth},#{m_date},#{m_subject},#{m_text}) ";
	
	public static final String MEMO_UPDATE
	=" UPDATE tbl_memo "
			+ " SET m_auth =#{m_auth}, m_date=#{m_date}, m_subject =#{m_subject}, m_text=#{m_text} ";
	
	public static final String MEMO_DELETE
	 = " DELETE * FROM tbl_memo WHERE id= #{id} ";
	
}

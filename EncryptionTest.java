package com.gc.encrypt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EncryptionTest {

	@Test
	public void mustInitialize(){
		assertTrue(1==1);
	}
	
	@Test
	public void mustEncrypt(){
		assertEquals("mnopqrstuvwxyz1234567890abcdefghijkl !@#$%^&*()",Security.encryptor("abcdefghijklmnopqrstuvwxyz1234567890 !@#$%^&*()"));
	}
	@Test
	public void mustDecrypt(){
		assertEquals("abcdefghijklmnopqrstuvwxyz1234567890 !@#$%^&*()",Security.decryptor("mnopqrstuvwxyz1234567890abcdefghijkl !@#$%^&*()"));
	}

}

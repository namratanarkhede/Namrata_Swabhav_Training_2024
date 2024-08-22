package com.aurionpro.test;

import com.aurionpro.model.MetaDataDb;

public class MetadataTest {

	public static void main(String[] args) {
		MetaDataDb connection = new MetaDataDb();
		connection.connectToDb();
	}

}

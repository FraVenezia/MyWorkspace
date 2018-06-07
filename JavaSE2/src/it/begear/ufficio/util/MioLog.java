package it.begear.ufficio.util;

import java.util.logging.Logger;

public class MioLog {
	
	private static Logger mioLogger=null;

	private MioLog() {}

	public static Logger getIstanzaMioLogger() {
		if(mioLogger==null) {
			mioLogger=Logger.getLogger("RootLogger");
			return mioLogger;
		}
		return mioLogger;
	}	
}

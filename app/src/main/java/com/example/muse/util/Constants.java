package com.example.muse.util;

import java.util.regex.Pattern;

public class Constants {
//	final public static String BASE_URL = "http://192.168.1.22:8081/"; // Daniel's inner network ip.
	final public static String BASE_URL = "http://192.168.1.183:8081/"; // Nir's inner network ip.
//	final public static String BASE_URL = "http://77.126.13.137:8081/"; // Nir's ip address.

	final public static String BASE_BOOKS_API_URL = "https://www.googleapis.com/";
	final public static String BOOK_API_MAX_SIZE = "10";

	final public static String DELIMITER = ";";
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

//	between 6 to 50 chars, must contain at least 1 letter and at least 1 number, may contain special signs such as !@#$%^&*
	public static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d^a-zA-Z0-9].{5,50}$");

	public static final String SPACE_NAME = "2021a.hadar.bonavida";

// -----------------MULTYPLAY--------------

	public static final String KEY_MY_ACCOUNT_JSON = "KEY_MY_ACCOUNT_JSON";
	public static final String KEY_SHOW_FOLLOWING_OR_FOLLOWERS = "KEY_SHOW_FOLLOWING_OR_FOLLOWERS";
	public static final String KEY_CHAT_WITH = "KEY_CHAT_WITH";

	public static final String KEY_MARK_IS_OWNER = "KEY_MARK_IS_OWNER";
	public static final boolean MY_PROFILE = true;
	public static final boolean VISITED_PROFILE = false;

	public static final String PREFS_KEY_WRONG_PASS_COUNTER = "PREFS_KEY_WRONG_PASS_COUNTER";
	public static final String PREFS_KEY_ACCOUNT_SERIAL = "PREFS_KEY_ACCOUNT_SERIAL";
	public static final String PREFS_KEY_ACCOUNT = "PREFS_KEY_ACCOUNT";
	public static final String PREFS_KEY_FOREIN_ACCOUNT = "PREFS_KEY_FOREIN_ACCOUNT";
	public static final String PREFS_KEY_CHAT_WITH_ACCOUNT = "PREFS_KEY_CHAT_WITH_ACCOUNT";
	public static final String PREFS_KEY_CURRENT_LOGGED_IN = "PREFS_KEY_CURRENT_LOGGED_IN";
	public static final String PREFS_KEY_SEARCH_FILTERS = "PREFS_KEY_SEARCH_FILTERS";
	public static final String PREFS_KEY_MY_FOLLOWING_LIST = "PREFS_KEY_MY_FOLLOWING_LIST";
	public static final String PREFS_KEY_MY_FOLLOWERS_LIST = "PREFS_KEY_MY_FOLLOWERS_LIST";
	public static final String PREFS_KEY_MY_OPEN_CHATS = "PREFS_KEY_MY_OPEN_CHATS";

	public static final String MSG_EMAIL_DONT_EXIST = "Email doesn't exist";
	public static final String MSG_WRONG_PASSWORD = "Wrong password, try again";
	public static final String MSG_LOCATION_NOT_FOUND = "Couldn't find location";

	public static final String PROFILE_PIC = "profilePic";
	public static final String COVER_PIC = "coverPic";
	public static final String LOGGED_IN = "LOGGED_IN";
	public static final String LOGGED_OUT = "LOGGED_OUT";

	public static final String FOLLOW = "Follow";
	public static final String FOLLOWING = "Following";
	public static final String FOLLOWERS = "Followers";

	public static final int MINIMUM_AGE = 13;
	public static final int MAX_WORDS_FOR_NICKNAME = 1;
	public static final int MIN_SEARCH_DISTANCE = 2;

	public static final int DEFAULT_SEARCH_FILTER_MAX_DISTANCE = 10;
	public static final int DEFAULT_SEARCH_FILTER_MIN_AGE = 18;
	public static final int DEFAULT_SEARCH_FILTER_MAX_AGE = 28;

	public static final int PERMISSION_REQUEST_CODE = 1000;

}

/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.limits;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.Arrays;

public class Constants {

  public static final int EDAM_ATTRIBUTE_LEN_MIN = 1;

  public static final int EDAM_ATTRIBUTE_LEN_MAX = 4096;

  public static final String EDAM_ATTRIBUTE_REGEX = "^[^\\p{Cc}\\p{Zl}\\p{Zp}]{1,4096}$";

  public static final int EDAM_ATTRIBUTE_LIST_MAX = 100;

  public static final int EDAM_ATTRIBUTE_MAP_MAX = 100;

  public static final int EDAM_GUID_LEN_MIN = 36;

  public static final int EDAM_GUID_LEN_MAX = 36;

  public static final String EDAM_GUID_REGEX = "^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$";

  public static final int EDAM_EMAIL_LEN_MIN = 6;

  public static final int EDAM_EMAIL_LEN_MAX = 255;

  public static final String EDAM_EMAIL_LOCAL_REGEX = "^[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+(\\.[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+)*$";

  public static final String EDAM_EMAIL_DOMAIN_REGEX = "^[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*\\.([A-Za-z]{2,})$";

  public static final String EDAM_EMAIL_REGEX = "^[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+(\\.[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*\\.([A-Za-z]{2,})$";

  public static final int EDAM_TIMEZONE_LEN_MIN = 1;

  public static final int EDAM_TIMEZONE_LEN_MAX = 32;

  public static final String EDAM_TIMEZONE_REGEX = "^([A-Za-z_-]+(/[A-Za-z_-]+)*)|(GMT(-|\\+)[0-9]{1,2}(:[0-9]{2})?)$";

  public static final int EDAM_MIME_LEN_MIN = 3;

  public static final int EDAM_MIME_LEN_MAX = 255;

  public static final String EDAM_MIME_REGEX = "^[A-Za-z]+/[A-Za-z0-9._+-]+$";

  public static final String EDAM_MIME_TYPE_GIF = "image/gif";

  public static final String EDAM_MIME_TYPE_JPEG = "image/jpeg";

  public static final String EDAM_MIME_TYPE_PNG = "image/png";

  public static final String EDAM_MIME_TYPE_WAV = "audio/wav";

  public static final String EDAM_MIME_TYPE_MP3 = "audio/mpeg";

  public static final String EDAM_MIME_TYPE_AMR = "audio/amr";

  public static final String EDAM_MIME_TYPE_MP4_VIDEO = "video/mp4";

  public static final String EDAM_MIME_TYPE_INK = "application/vnd.evernote.ink";

  public static final String EDAM_MIME_TYPE_PDF = "application/pdf";

  public static final String EDAM_MIME_TYPE_DEFAULT = "application/octet-stream";

  public static final Set<String> EDAM_MIME_TYPES = new HashSet<String>();
  static {
    EDAM_MIME_TYPES.add("image/gif");
    EDAM_MIME_TYPES.add("image/jpeg");
    EDAM_MIME_TYPES.add("image/png");
    EDAM_MIME_TYPES.add("audio/wav");
    EDAM_MIME_TYPES.add("audio/mpeg");
    EDAM_MIME_TYPES.add("audio/amr");
    EDAM_MIME_TYPES.add("application/vnd.evernote.ink");
    EDAM_MIME_TYPES.add("application/pdf");
    EDAM_MIME_TYPES.add("video/mp4");
  }

  public static final String EDAM_COMMERCE_SERVICE_GOOGLE = "Google";

  public static final String EDAM_COMMERCE_SERVICE_PAYPAL = "Paypal";

  public static final String EDAM_COMMERCE_SERVICE_GIFT = "Gift";

  public static final String EDAM_COMMERCE_SERVICE_TRIALPAY = "TrialPay";

  public static final String EDAM_COMMERCE_SERVICE_TRIAL = "Trial";

  public static final String EDAM_COMMERCE_SERVICE_GROUP = "Group";

  public static final String EDAM_COMMERCE_SERVICE_CYBERSOURCE = "CYBERSRC";

  public static final String EDAM_COMMERCE_DEFAULT_CURRENCY_COUNTRY_CODE = "USD";

  public static final int EDAM_SEARCH_QUERY_LEN_MIN = 0;

  public static final int EDAM_SEARCH_QUERY_LEN_MAX = 1024;

  public static final String EDAM_SEARCH_QUERY_REGEX = "^[^\\p{Cc}\\p{Zl}\\p{Zp}]{0,1024}$";

  public static final int EDAM_HASH_LEN = 16;

  public static final int EDAM_USER_USERNAME_LEN_MIN = 1;

  public static final int EDAM_USER_USERNAME_LEN_MAX = 64;

  public static final String EDAM_USER_USERNAME_REGEX = "^[a-z0-9]([a-z0-9_-]{0,62}[a-z0-9])?$";

  public static final int EDAM_USER_NAME_LEN_MIN = 1;

  public static final int EDAM_USER_NAME_LEN_MAX = 255;

  public static final String EDAM_USER_NAME_REGEX = "^[^\\p{Cc}\\p{Zl}\\p{Zp}]{1,255}$";

  public static final int EDAM_TAG_NAME_LEN_MIN = 1;

  public static final int EDAM_TAG_NAME_LEN_MAX = 100;

  public static final String EDAM_TAG_NAME_REGEX = "^[^,\\p{Cc}\\p{Z}]([^,\\p{Cc}\\p{Zl}\\p{Zp}]{0,98}[^,\\p{Cc}\\p{Z}])?$";

  public static final int EDAM_NOTE_TITLE_LEN_MIN = 1;

  public static final int EDAM_NOTE_TITLE_LEN_MAX = 255;

  public static final String EDAM_NOTE_TITLE_REGEX = "^[^\\p{Cc}\\p{Z}]([^\\p{Cc}\\p{Zl}\\p{Zp}]{0,253}[^\\p{Cc}\\p{Z}])?$";

  public static final int EDAM_NOTE_CONTENT_LEN_MIN = 0;

  public static final int EDAM_NOTE_CONTENT_LEN_MAX = 5242880;

  public static final int EDAM_APPLICATIONDATA_NAME_LEN_MIN = 3;

  public static final int EDAM_APPLICATIONDATA_NAME_LEN_MAX = 32;

  public static final int EDAM_APPLICATIONDATA_VALUE_LEN_MIN = 0;

  public static final int EDAM_APPLICATIONDATA_VALUE_LEN_MAX = 4092;

  public static final int EDAM_APPLICATIONDATA_ENTRY_LEN_MAX = 4095;

  public static final String EDAM_APPLICATIONDATA_NAME_REGEX = "^[A-Za-z0-9_.-]{3,32}$";

  public static final String EDAM_APPLICATIONDATA_VALUE_REGEX = "^[^\\p{Cc}]{0,4092}$";

  public static final int EDAM_NOTEBOOK_NAME_LEN_MIN = 1;

  public static final int EDAM_NOTEBOOK_NAME_LEN_MAX = 100;

  public static final String EDAM_NOTEBOOK_NAME_REGEX = "^[^\\p{Cc}\\p{Z}]([^\\p{Cc}\\p{Zl}\\p{Zp}]{0,98}[^\\p{Cc}\\p{Z}])?$";

  public static final int EDAM_NOTEBOOK_STACK_LEN_MIN = 1;

  public static final int EDAM_NOTEBOOK_STACK_LEN_MAX = 100;

  public static final String EDAM_NOTEBOOK_STACK_REGEX = "^[^\\p{Cc}\\p{Z}]([^\\p{Cc}\\p{Zl}\\p{Zp}]{0,98}[^\\p{Cc}\\p{Z}])?$";

  public static final int EDAM_PUBLISHING_URI_LEN_MIN = 1;

  public static final int EDAM_PUBLISHING_URI_LEN_MAX = 255;

  public static final String EDAM_PUBLISHING_URI_REGEX = "^[a-zA-Z0-9.~_+-]{1,255}$";

  public static final Set<String> EDAM_PUBLISHING_URI_PROHIBITED = new HashSet<String>();
  static {
    EDAM_PUBLISHING_URI_PROHIBITED.add("..");
  }

  public static final int EDAM_PUBLISHING_DESCRIPTION_LEN_MIN = 1;

  public static final int EDAM_PUBLISHING_DESCRIPTION_LEN_MAX = 200;

  public static final String EDAM_PUBLISHING_DESCRIPTION_REGEX = "^[^\\p{Cc}\\p{Z}]([^\\p{Cc}\\p{Zl}\\p{Zp}]{0,198}[^\\p{Cc}\\p{Z}])?$";

  public static final int EDAM_SAVED_SEARCH_NAME_LEN_MIN = 1;

  public static final int EDAM_SAVED_SEARCH_NAME_LEN_MAX = 100;

  public static final String EDAM_SAVED_SEARCH_NAME_REGEX = "^[^\\p{Cc}\\p{Z}]([^\\p{Cc}\\p{Zl}\\p{Zp}]{0,98}[^\\p{Cc}\\p{Z}])?$";

  public static final int EDAM_USER_PASSWORD_LEN_MIN = 6;

  public static final int EDAM_USER_PASSWORD_LEN_MAX = 64;

  public static final String EDAM_USER_PASSWORD_REGEX = "^[A-Za-z0-9!#$%&'()*+,./:;<=>?@^_`{|}~\\[\\]\\\\-]{6,64}$";

  public static final int EDAM_NOTE_TAGS_MAX = 100;

  public static final int EDAM_NOTE_RESOURCES_MAX = 1000;

  public static final int EDAM_USER_TAGS_MAX = 100000;

  public static final int EDAM_USER_SAVED_SEARCHES_MAX = 100;

  public static final int EDAM_USER_NOTES_MAX = 100000;

  public static final int EDAM_USER_NOTEBOOKS_MAX = 250;

  public static final int EDAM_USER_RECENT_MAILED_ADDRESSES_MAX = 10;

  public static final int EDAM_USER_MAIL_LIMIT_DAILY_FREE = 50;

  public static final int EDAM_USER_MAIL_LIMIT_DAILY_PREMIUM = 200;

  public static final long EDAM_USER_UPLOAD_LIMIT_FREE = 62914560L;

  public static final long EDAM_USER_UPLOAD_LIMIT_PREMIUM = 1073741824L;

  public static final int EDAM_NOTE_SIZE_MAX_FREE = 26214400;

  public static final int EDAM_NOTE_SIZE_MAX_PREMIUM = 52428800;

  public static final int EDAM_RESOURCE_SIZE_MAX_FREE = 26214400;

  public static final int EDAM_RESOURCE_SIZE_MAX_PREMIUM = 52428800;

  public static final int EDAM_USER_LINKED_NOTEBOOK_MAX = 100;

  public static final int EDAM_NOTEBOOK_SHARED_NOTEBOOK_MAX = 250;

  public static final int EDAM_NOTE_CONTENT_CLASS_LEN_MIN = 3;

  public static final int EDAM_NOTE_CONTENT_CLASS_LEN_MAX = 32;

  public static final String EDAM_HELLO_APP_CONTENT_CLASS_PREFIX = "evernote.hello.";

  public static final String EDAM_FOOD_APP_CONTENT_CLASS_PREFIX = "evernote.food.";

  public static final String EDAM_NOTE_CONTENT_CLASS_REGEX = "^[A-Za-z0-9_.-]{3,32}$";

  public static final String EDAM_CONTENT_CLASS_HELLO_ENCOUNTER = "evernote.hello.encounter";

  public static final String EDAM_CONTENT_CLASS_HELLO_PROFILE = "evernote.hello.profile";

  public static final String EDAM_CONTENT_CLASS_FOOD_MEAL = "evernote.food.meal";

}

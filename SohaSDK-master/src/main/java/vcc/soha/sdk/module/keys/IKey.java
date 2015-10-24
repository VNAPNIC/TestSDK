package vcc.soha.sdk.module.keys;

public interface IKey {

    public final String TEST_Q  = "q";
    public final String TEST_ID = "appid";
    /*
     * **********************************************************************
     * Key for action USER DATA
     * **********************************************************************
     */
    public final String KEY_API_USER_DATA_ID                                    = "user_id";
    public final String KEY_API_USER_DATA_AVATAR                                = "avatar";
    public final String KEY_API_USER_DATA_NAME                                  = "username";
    public final String KEY_API_USER_DATA_SCOIN                                 = "scoin";
    public final String KEY_API_USER_DATA_LEVEL                                 = "level";
    public final String KEY_API_USER_DATA_EGG                                   = "egg";
    /*
     * **********************************************************************
     * Key for action GIFT WHEEL
     * **********************************************************************
     */
    public final String KEY_API_WHEEL_TOTAL_EGG                                 = "total_egg";
    public final String KEY_API_WHEEL_FREE_TURN                                 = "free_turn";
    public final String KEY_API_WHEEL_PAID_TURN                                 = "paid_turn";
    public final String KEY_API_WHEEL_ONE_TURN                                  = "one_turn";
    public final String KEY_API_WHEEL_LIST_ITEMS                                = "list";
    public final String KEY_API_WHEEL_DATA                                      = "data";
    public final String KEY_API_WHEEL_INDEX                                     = "index";
    
    /*
     * **********************************************************************
     * Key for action CHAT
     * **********************************************************************
     */
    public final String KEY_API_CHAT                                            = "messages";
    public final String KEY_API_CHAT_TIME                                       = "time";
    public final String KEY_API_CHAT_USERNAME                                   = "username";
    public final String KEY_API_CHAT_USER_ID                                    = "uid";
    public final String KEY_API_CHAT_USER_IDS                                   = "user_ids";
    public final String KEY_API_CHAT_MESSAGE                                    = "message";
    public final String KEY_API_CHAT_DATA                                       = "data";
    public final String KEY_API_CHAT_MESSAGE_TYPE                               = "message_type";
    public final String KEY_API_CHAT_MESSAGE_POSSITION                          = "position";
    public final String KEY_API_CHAT_TYPE                                       = "type";
    public final String KEY_API_CHAT_CARD_ID                                    = "card_id";
    public final String KEY_API_CHAT_SINGAL                                     = "signal";
    public final String KEY_API_CHAT_CARD_TYPE                                  = "card_type";
    public final String KEY_API_CHAT_DATA_LOCAL                                 = "data_local";
    public final String KEY_API_CHAT_IMAGE_URL                                  = "url";
    public final String KEY_API_CHAT_AUDIO_DURATION                             = "duration";
    public final String KEY_API_CHAT_CLIENT_MESSAGE_ID                          = "client_message_id";
    public final String KEY_API_CHAT_STATE                                      = "chat_status";
    public final String KEY_API_CHAT_STATE_DEFAULT                              = "default";
    public final String KEY_API_CHAT_STATE_READ                                 = "read";
    public final String KEY_API_CHAT_STATUS_RECEIVE                             = "receive";
    public final String KEY_API_CHAT_STATUS_ERROR                               = "error";
    /*
     * **********************************************************************
     * Key for action CHAT GUILD
     * **********************************************************************
     */
    public final String KEY_API_CHAT_GUILD_ID                                   = "id";
    
    /*
     * **********************************************************************
     * Key for action FRIENDS
     * **********************************************************************
     */
    public final String KEY_API_LIST_FRIENDS_OTHER                              = "other";
    public final String KEY_API_LIST_FRIENDS_ID                                 = "id";
    public final String KEY_API_LIST_FRIENDS_USERNAME                           = "username";
    public final String KEY_API_LIST_FRIENDS_CHECKED                            = "checked";
    public final String KEY_API_LIST_FRIENDS_CHECKED_TRUE                       = "true";
    public final String KEY_API_LIST_FRIENDS_CHECKED_FALSE                      = "false";
    
    /*
     * **********************************************************************
     * Key for action UPLOAD
     * **********************************************************************
     */
    public final String KEY_API_UPLOAD_PATH                                     = "path";
    public final String KEY_API_UPLOAD_FIELDS                                   = "fields";
    public final String KEY_API_UPLOAD_FIELDS_URL                               = "file.url";
    
    /*
     * **********************************************************************
     * Key for action COMMENT
     * **********************************************************************
     */
    public final String KEY_API_COMMENT_CARD_ID                                 = "card_id";
    public final String KEY_API_COMMENT_TIME                                    = "time";
    public final String KEY_API_COMMENT_USERNAME                                = "username";
    public final String KEY_API_COMMENT_USER_ID                                 = "uid";
    public final String KEY_API_COMMENT_MESSAGE                                 = "message";
    public final String KEY_API_COMMENT_DATA                                    = "data";
    public final String KEY_API_COMMENT_MESSAGE_TYPE                            = "message_type";
    public final String KEY_API_COMMENT_TYPE                                    = "type";
    public final String KEY_API_COMMENT_POSITION                                = "position";
    public final String KEY_API_COMMENT_CLIENT_MESSAGE_ID                       = "client_message_id";
    
    /*
     * **********************************************************************
     * Key for action FRIEND_GET_REQUEST
     * **********************************************************************
     */
    public final String KEY_API_FRIEND_GET_REQUEST_ID                           = "id";
    public final String KEY_API_FRIEND_GET_REQUEST_FRIEND                       = "friend";
    public final String KEY_API_FRIEND_GET_REQUEST_TOTALPAGE                    = "totalPage";
    public final String KEY_API_FRIEND_GET_REQUEST_USER_ID                      = "user_id";
    public final String KEY_API_FRIEND_GET_REQUEST_USERNAME                     = "username";
    public final String KEY_API_FRIEND_GET_REQUEST_STATUS                       = "status";
    public final String KEY_API_FRIEND_GET_REQUEST_MSG                          = "msg";
    public final String KEY_API_FRIEND_GET_REQUEST_MUTUAL                       = "mutual";
    
    /*
     * **********************************************************************
     * Key for action FRIEND_GET_RECENT
     * **********************************************************************
     */
    public final String KEY_API_FRIEND_GET_RECENT_FRIEND                        = "friend";
    public final String KEY_API_FRIEND_GET_RECENT_TOTALPAGE                     = "totalPage";
    public final String KEY_API_FRIEND_GET_RECENT_USER_ID                       = "user_id";
    public final String KEY_API_FRIEND_GET_RECENT_USERNAME                      = "username";
    public final String KEY_API_FRIEND_GET_RECENT_STATUS                        = "status";
    public final String KEY_API_FRIEND_GET_RECENT_MSG                           = "msg";
    public final String KEY_API_FRIEND_GET_RECENT_MUTUAL                        = "mutual";
    
    /*
     * **********************************************************************
     * Key for action FRIEND_GET_SUGGEST
     * **********************************************************************
     */
    public final String KEY_API_FRIEND_GET_SUGGEST_ID                           = "id";
    public final String KEY_API_FRIEND_GET_SUGGEST_FRIEND                       = "friend";
    public final String KEY_API_FRIEND_GET_SUGGEST_TOTALPAGE                    = "totalPage";
    public final String KEY_API_FRIEND_GET_SUGGEST_USER_ID                      = "id";
    public final String KEY_API_FRIEND_GET_SUGGEST_USERNAME                     = "username";
    public final String KEY_API_FRIEND_GET_SUGGEST_STATUS                       = "status";
    public final String KEY_API_FRIEND_GET_SUGGEST_MSG                          = "msg";
    public final String KEY_API_FRIEND_GET_SUGGEST_MUTUAL                       = "mutual";
    
    /*
     * **********************************************************************
     * Key for action FRIEND_GET_LIST_ALL
     * **********************************************************************
     */
    public final String KEY_API_FRIEND_GET_LIST_ALL_GAME                        = "game";
    public final String KEY_API_FRIEND_GET_LIST_ALL_FRIENDS                     = "friends";
    public final String KEY_API_FRIEND_GET_LIST_ALL_OTHER                       = "other";
    public final String KEY_API_FRIEND_GET_LIST_ALL_ID                          = "id";
    public final String KEY_API_FRIEND_GET_LIST_ALL_USERNAME                    = "username";
    public final String KEY_API_FRIEND_GET_LIST_ALL_NAME                        = "name";
    public final String KEY_API_FRIEND_GET_LIST_ALL_MUTUAL                      = "mutual";
    public final String KEY_API_FRIEND_GET_LIST_ALL_LASTTIME                    = "last_time";
    
    /*
     * **********************************************************************
     * Key for action FRIEND_GROUP_LIST
     * **********************************************************************
     */
    public final String KEY_API_GROUP_LIST_ID                                   = "id";
    public final String KEY_API_GROUP_LIST_NAME                                 = "name";
    public final String KEY_API_GROUP_LIST_DATA                                 = "data";
    public final String KEY_API_GROUP_LIST_TOTAL_PAGE                           = "totalPage";
    public final String KEY_API_GROUP_LIST_DESCRIPTION                          = "description";
    public final String KEY_API_GROUP_LIST_IMAGE                                = "image";
    public final String KEY_API_GROUP_LIST_ICON                                 = "icon";
    public final String KEY_API_GROUP_LIST_STATUS                               = "status";
    public final String KEY_API_GROUP_LIST_TOTALMEMBER                          = "totalMember";
    public final String KEY_API_GROUP_LIST_PRIVACY                              = "privacy";
    public final String KEY_API_GROUP_LIST_ISJOINED                             = "is_joined";
    public final String KEY_API_GROUP_LIST_TYPE                                 = "type";
    public final String KEY_API_GROUP_LIST_ROLE                                 = "role";
    
    /*
     * **********************************************************************
     * Key for action GROUP_UPLOAD_IMAGE
     * **********************************************************************
     */
    public final String KEY_API_GROUP_IMAGE_UPLOAD_URL                          = "url";
    /*
     * **********************************************************************
     * Key for action FRIEND_GROUP_CARD
     * **********************************************************************
     */
    public final String KEY_API_GROUP_CARD_ID                                   = "id";
    public final String KEY_API_GROUP_CARD_TOTAL_PAGE                           = "totalPage";
    public final String KEY_API_GROUP_CARD_DATA                                 = "data";
    public final String KEY_API_GROUP_CARD_ONWER                                = "onwer";
    public final String KEY_API_GROUP_CARD_USERNAME                             = "username";
    public final String KEY_API_GROUP_CARD_AVATAR                               = "avatar";
    public final String KEY_API_GROUP_CARD_LIKE_NUMBER                          = "like_number";
    public final String KEY_API_GROUP_CARD_TOTAL_COMMENT                        = "totalComment";
    public final String KEY_API_GROUP_CARD_CONTENT                              = "content";
    public final String KEY_API_GROUP_CARD_SHORT_DES                            = "short_description";
    public final String KEY_API_GROUP_CARD_IMAGES                               = "images";
    public final String KEY_API_GROUP_CARD_UPDATE_AT                            = "update_at";
    /*
     * **********************************************************************
     * Key for action GET_GAME_BY_USER
     * **********************************************************************
     */
    public final String KEY_API_GAME_LIST_ID                                    = "id";
    public final String KEY_API_GAME_LIST_NAME                                  = "name";
    public final String KEY_API_GAME_LIST_ICON                                  = "icon";
    /*
     * **********************************************************************
     * Key for action GROUP_ICON_LIST
     * **********************************************************************
     */
    public final String KEY_API_GROUP_ICON_ID                                   = "id";
    public final String KEY_API_GROUP_IMAGE_LIGHT                               = "iconLight";
    public final String KEY_API_GROUP_IMAGE_GRAY                                = "iconGray";
    
    /*
     * **********************************************************************
     * Key for action FRIEND_GROUP_DEAIL
     * **********************************************************************
     */
    public final String KEY_API_GROUP_DETAIL_ID                                 = "id";
    public final String KEY_API_GROUP_DETAIL_IMAGE                              = "image";
    public final String KEY_API_GROUP_DETAIL_ICON                               = "icon";
    public final String KEY_API_GROUP_DETAIL_NAME                               = "name";
    
    /*
     * **********************************************************************
     * Key for action FRIEND_GET_LIST_CARD
     * **********************************************************************
     */
    public final String KEY_API_GET_LIST_CARD_ID                                = "id";
    public final String KEY_API_GET_LIST_CARD_CARD_TYPE                         = "card_type";
    
    public final String KEY_API_GET_LIST_CARD_CONTENT                           = "content";
    public final String KEY_API_GET_LIST_CARD_CONTENT_TITLE                     = "title";
    public final String KEY_API_GET_LIST_CARD_CONTENT_DESCRIPTION               = "description";
    public final String KEY_API_GET_LIST_CARD_CONTENT_SHORT_DESCRIPTION         = "short_description";
    public final String KEY_API_GET_LIST_CARD_CONTENT_IMAGES                    = "images";
    public final String KEY_API_GET_LIST_CARD_CONTENT_IMAGES_CAPTION            = "caption";
    public final String KEY_API_GET_LIST_CARD_CONTENT_IMAGES_IMAGE              = "image";
    public final String KEY_API_GET_LIST_CARD_CONTENT_START_TIME                = "start_time";
    public final String KEY_API_GET_LIST_CARD_CONTENT_END_TIME                  = "end_time";
    public final String KEY_API_GET_LIST_CARD_CONTENT_ADDRESS                   = "address";
    public final String KEY_API_GET_LIST_CARD_UPDATE_TIME                       = "update_at";
    
    public final String KEY_API_GET_LIST_CARD_CONTACT_INFO                      = "contact_info";
    public final String KEY_API_GET_LIST_CARD_CONTACT_INFO_PHONE_NUMBER         = "phone_number";
    public final String KEY_API_GET_LIST_CARD_CONTACT_INFO_ADDRESS              = "address";
    
    public final String KEY_API_GET_LIST_CARD_ACTIONS                           = "actions";
    
    public final String KEY_API_GET_LIST_CARD_USER_IDS                          = "user_ids";
    public final String KEY_API_GET_LIST_CARD_USER_IDS_USERID                   = "user_id";
    public final String KEY_API_GET_LIST_CARD_USER_IDS_USERNAME                 = "username";
    
    public final String KEY_API_GET_LIST_CARD_PRIVACY                           = "privacy";
    public final String KEY_API_GET_LIST_CARD_CUST_ID                           = "cust_id";
    public final String KEY_API_GET_LIST_CARD_STATUS                            = "status";
    public final String KEY_API_GET_LIST_CARD_GAME_ID                           = "game_id";
    public final String KEY_API_GET_LIST_CARD_CREATE_AT                         = "create_at";
    public final String KEY_API_GET_LIST_CARD_UPDATE_AT                         = "update_at";
    public final String KEY_API_GET_LIST_CARD_ADMIN_IDS                         = "admin_ids";
    public final String KEY_API_GET_LIST_CARD_ALLOW_GET                         = "allow_get";
    public final String KEY_API_GET_LIST_CARD_BANGHOI_IDS                       = "bang_hoi_ids";
    public final String KEY_API_GET_LIST_CARD_CONTENT_LINK                      = "content_link";
    public final String KEY_API_GET_LIST_CARD_CONTENT_ICON                      = "content_icon";
    public final String KEY_API_GET_LIST_CARD_LIMIT_DEVICE                      = "limit_device";
    public final String KEY_API_GET_LIST_CARD_LIMIT_DEVICE_TYPE                 = "limit_device_type";
    public final String KEY_API_GET_LIST_CARD_GROUP                             = "group";
    public final String KEY_API_GET_LIST_CARD_LIKE_NUMBER                       = "like_number";
    public final String KEY_API_GET_LIST_CARD_JOIN_NUMBER                       = "join_number";
    public final String KEY_API_GET_LIST_CARD_IS_JOINED                         = "is_joined";
    public final String KEY_API_GET_LIST_CARD_IS_LIKED                          = "is_liked";
    public final String KEY_API_GET_LIST_CARD_READ                              = "read";
    public final String KEY_API_GET_LIST_CARD_NOTIFICATION_TYPE                 = "notification_type";
    public final String KEY_API_GET_LIST_CARD_OWNER                             = "onwer";
    public final String KEY_API_GET_LIST_CARD_OWNER_USER_ID                     = "user_id";
    public final String KEY_API_GET_LIST_CARD_OWNER_USERNAME                    = "username";
    public final String KEY_API_GET_LIST_CARD_AVATAR                            = "avatar";
    public final String KEY_API_GET_LIST_CARD_COMMENT                           = "comment";
    public final String KEY_API_GET_LIST_CARD_COMMENT_MESSEGER                  = "message";
    public final String KEY_API_GET_LIST_CARD_COMMENT_TYPE                      = "type";
    
    /*
     * **********************************************************************
     * Key for action MENU_TAB
     * **********************************************************************
     */
    public final String KEY_API_MENUTAB_GIFTCODE                                = "scoin";
    public final String KEY_API_MENUTAB_CHANGEPASSWORD_RESULT_MESSEGER          = "msg";
    public final String KEY_API_MENUTAB_SCOINSTRANSFER_FILTER_PAYMENTURL        = "payment_url";
    public final String KEY_API_MENUTAB_SCOINSTRANSFER_FILTER_NAMEGAME          = "name";
    
    public final String KEY_API_MENUTAB_HISTORYSCOIN_USERID                     = "user_id";
    public final String KEY_API_MENUTAB_HISTORYSCOIN_GAMENAME                   = "game_name";
    public final String KEY_API_MENUTAB_HISTORYSCOIN_SCOIN                      = "scoin";
    public final String KEY_API_MENUTAB_HISTORYSCOIN_TIME                       = "time";
    public final String KEY_API_MENUTAB_HISTORYSCOIN_ICONGAME                   = "icon_game";
    
    public final String KEY_API_MENUTAB_AWARD_HISTORY_LEFT_GIFT                 = "gift";
    public final String KEY_API_MENUTAB_AWARD_HISTORY_LEFT_CREATE_AT            = "created_at";
    public final String KEY_API_MENUTAB_AWARD_HISTORY_LEFT_TITLE                = "title";
    public final String KEY_API_MENUTAB_AWARD_HISTORY_LEFT_GAME_NAME            = "game_name";
    public final String KEY_API_MENUTAB_AWARD_HISTORY_LEFT_ICON                 = "icon";
    
    public final String kEY_API_MENUTAB_AWARD_HISTORY_RIGHT_TEXT                = "text";
    public final String kEY_API_MENUTAB_AWARD_HISTORY_RIGHT_VALUE               = "value";
    public final String kEY_API_MENUTAB_AWARD_HISTORY_RIGHT_TIME                = "time";
    
    public final String kEY_API_MENUTAB_AWARD_RECEIVE_LIST                      = "list";
    public final String kEY_API_MENUTAB_AWARD_RECEIVE_LIST_TEXT                 = "text";
    public final String kEY_API_MENUTAB_AWARD_RECEIVE_LIST_TEXT_VALUE           = "text_value";
    public final String kEY_API_MENUTAB_AWARD_RECEIVE_LIST_EGG                  = "value";
    
    public final String KEY_PICKER_IMAGE_ALL                                    = "all_path";
    
    /*
     * ********************************************************************
     * Key for action GIFT_AWARD_INDEX & SALE_GAME_INDEX & GIFT_CODE_INDEX
     * ********************************************************************
     */
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_ID                        = "id";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_CONTENT                   = "content";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_CONTENT_ICON              = "content_icon";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_CONTENT_LINK              = "content_link";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_CONTENT_TITLE             = "title";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_CONTENT_DESCRIPTION       = "description";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_CONTENT_SHORT_DESCRIPTION = "short_description";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_GAME_ID                   = "game_id";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_PRICE                     = "price";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_PRICE_SALE                = "price_sale";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_IS_AWARD                  = "is_award";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_UPDATE_AT                 = "update_at";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_OWNER                     = "onwer";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_OWNER_USERNAME            = "username";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_LIKE_NUMBER               = "like_number";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_IS_LIKED                  = "is_liked";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_IS_SALE                   = "is_sale";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_TOTAL_PRODUCT             = "totalProduct";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_TOTAL_COMMENT             = "totalComment";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_GIFTCODE                  = "gift_code";
    public final String KEY_API_LEFT_MENU_AWARD_INDEX_AVATAR                    = "avatar";
    /*
     * ********************************************************************
     * Key for action NEWS_FEED
     * ********************************************************************
     */
    public final String KEY_API_NEWS_FEED_ID                                    = "id";
    public final String KEY_API_NEWS_FEED_USER                                  = "onwer";
    public final String KEY_API_NEWS_FEED_USER_NAME                             = "username";
    public final String KEY_API_NEWS_FEED_GROUP                                 = "group";
    public final String KEY_API_NEWS_FEED_GROUP_NAME                            = "name";
    public final String KEY_API_NEWS_FEED_TIME_POST                             = "create_at";
    public final String KEY_API_NEWS_FEED_CONTENT                               = "content";
    public final String KEY_API_NEWS_FEED_SHORT_CONTENT                         = "short_description";
    public final String KEY_API_NEWS_FEED_LIKE_NUMBER                           = "like_number";
    public final String KEY_API_NEWS_FEED_COMMENT_COUNT                         = "totalComment";
    public final String KEY_API_NEWS_FEED_ICON                                  = "avatar";
    public final String KEY_API_NEWS_FEED_IS_ADMIN                              = "is_admin";
    public final String KEY_API_NEWS_FEED_IMAGES                                = "images";
    public final String KEY_API_NEWS_FEED_NEW                                   = "new";
    public final String KEY_API_NEWS_FEED_OLD                                   = "old";
    public final String kEY_API_NEWS_FEED_IS_LIKE                               = "is_liked";
    public final String KEY_API_NEWS_FEED_DESCRIPTION                           = "description";
    public final String KEY_API_NEWS_FEED_UPDATE_AT                             = "update_at";
    public final String KEY_API_NEWS_FEED_COMMENT                               = "comment";
    public final String KEY_API_NEWS_FEED_CARD_TYPE                             = "card_type";
    public final String KEY_API_NEWS_FEED_SUGGEST_RESULT                        = "result";
    public final String KEY_API_NEWS_FEED_SUGGEST_TITLE                         = "title";
    // Suggest friend
    public final String KEY_API_NEWS_FEED_SUGGEST_FRIEND_TYPE                   = "suggest_friend";
    public final String KEY_API_NEWS_FEED_SUGGEST_FRIEND_ID                     = "user_id";
    public final String KEY_API_NEWS_FEED_SUGGEST_FRIEND_NAME                   = "username";
    public final String KEY_API_NEWS_FEED_SUGGEST_FRIEND_MUTUAL                 = "mutual";
    public final String KEY_API_NEWS_FEED_SUGGEST_FRIEND_STATUS                 = "status";
    // Suggest group
    public final String KEY_API_NEWS_FEED_SUGGEST_GROUP_TYPE                    = "suggest_friend";
    public final String KEY_API_NEWS_FEED_SUGGEST_GROUP_ID                      = "id";
    public final String KEY_API_NEWS_FEED_SUGGEST_GROUP_ICON                    = "icon";
    public final String KEY_API_NEWS_FEED_SUGGEST_GROUP_NAME                    = "name";
    public final String KEY_API_NEWS_FEED_SUGGEST_GROUP_PRIVACY                 = "privacy";
    public final String KEY_API_NEWS_FEED_SUGGEST_GROUP_DESCRIPTION             = "description";
    public final String KEY_API_NEWS_FEED_SUGGEST_GROUP_IMAGE                   = "image";
    public final String KEY_API_NEWS_FEED_SUGGEST_GROUP_TOTAL_MEMBER            = "totalMember";
    // Suggest game
    public final String KEY_API_NEWS_FEED_SUGGEST_GAME_COVER                    = "image_slider_mini";
    public final String KEY_API_NEWS_FEED_SUGGEST_GAME_NAME                     = "name";
    public final String KEY_API_NEWS_FEED_SUGGEST_GAME_TYPE                     = "suggest_game";
    public final String KEY_API_NEWS_FEED_SUGGEST_GAME_GAMER_COUNT              = "play_number";
    public final String KEY_API_NEWS_FEED_SUGGEST_GAME_DESCRIPTION              = "description";
    public final String KEY_API_NEWS_FEED_SUGGEST_GAME_LINK_IOS                 = "link_appstore";
    public final String KEY_API_NEWS_FEED_SUGGEST_GAME_LINK_LANDING             = "link_play";
    public final String KEY_API_NEWS_FEED_SUGGEST_GAME_PACKAGE                  = "package";
    
    /*
     * ********************************************************************
     * Key for action NOTIFICATION_INDEX & NOTIFICATION_READ
     * ********************************************************************
     */
    public final String KEY_API_NOTIFICATION_ID                                 = "id";
    public final String KEY_API_NOTIFICATION_TYPE                               = "type";
    public final String KEY_API_NOTIFICATION_IS_READ                            = "is_read";
    public final String KEY_API_NOTIFICATION_AVATAR                             = "avatar";
    public final String KEY_API_NOTIFICATION_ICON                               = "icon";
    public final String KEY_API_NOTIFICATION_UPDATED_AT                         = "update_at";
    public final String KEY_API_NOTIFICATION_MSG                                = "msg";
    public final String KEY_API_NOTIFICATION_DATA                               = "data";
    public final String KEY_API_NOTIFICATION_DATA_CARD_ID                       = "card_id";
    public final String KEY_API_NOTIFICATION_DATA_CARD_TYPE                     = "card_type";
    public final String KEY_API_NOTIFICATION_GROUP_ID                           = "group_id";
    
    /*
     * ********************************************************************
     * Key for action LOGIN
     * ********************************************************************
     */
    
    public final String KEY_API_LOGIN_USER_ID                                   = "user_id";
    
    /*
     * ********************************************************************
     * Key for action GET_USER_INFOMATION
     * ********************************************************************
     */
    
    public final String KEY_API_GET_USER_INFOMATION_USER_NAME                   = "username";
    
    /*
     * ********************************************************************
     * Key for action GET_NOTIFICATION
     * ********************************************************************
     */
    
    public final String KEY_API_GET_TOTAL_NOTIFICATION_NOTIFICATION             = "notification";
    public final String KEY_API_GET_TOTAL_NOTIFICATION_RECEIVED_FRIEND          = "received_friend";
}

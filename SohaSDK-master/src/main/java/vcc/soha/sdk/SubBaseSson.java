package vcc.soha.sdk;

import vcc.soha.sdk.keys.IKey;

/**
 * Created by hainam1421 on 10/21/2015.
 */
public class SubBaseSson implements IKey {

    /**
     * Tạo @Enum chứa các @Action
     */
    public enum Action {
        TEST,
        USER,
        GIFT_WHEEL,
        CHAT,
        CHAT_GUILD,
        FRIENDS,
        UPLOAD,
        COMMENT,
        FRIEND_GET_REQUEST,
        FRIEND_GET_RECENT,
        FRIEND_GET_SUGGEST,
        FRIEND_GET_LIST_ALL,
        FRIEND_GROUP_LIST,
        GROUP_UPLOAD_IMAGE,
        KEY_API_GROUP_IMAGE_UPLOAD_URL,
        FRIEND_GROUP_CARD,
        GET_GAME_BY_USER,
        GROUP_ICON_LIST,
        FRIEND_GROUP_DEAIL,
        FRIEND_GET_LIST_CARD,
        MENU_TAB,
        GIFT_AWARD_INDEX,
        SALE_GAME_INDEX,
        GIFT_CODE_INDEX,
        NEWS_FEED,
        NOTIFICATION_INDEX,
        NOTIFICATION_READ,
        LOGIN,
        GET_USER_INFOMATION,
        GET_NOTIFICATION;

    }

    // khởi tạo
    Action company;

    public void setCompany(Action company) {
        this.company = company;
    }

    /**
     * Hàm này dùng để lấy Các giá trị @param trong @Action
     */
    public String[] getKey() {
        String[] strAction = null;
        switch (company) {
            case TEST:
                strAction = new String[]{
                        TEST_Q, TEST_ID
                };
                break;
            case USER:
                strAction = new String[]{
                        KEY_API_USER_DATA_ID,
                        KEY_API_USER_DATA_AVATAR,
                        KEY_API_USER_DATA_NAME,
                        KEY_API_USER_DATA_SCOIN,
                        KEY_API_USER_DATA_LEVEL,
                        KEY_API_USER_DATA_EGG
                };
                break;
            case GIFT_WHEEL:
                strAction = new String[]{
                        KEY_API_WHEEL_TOTAL_EGG,
                        KEY_API_WHEEL_FREE_TURN,
                        KEY_API_WHEEL_PAID_TURN,
                        KEY_API_WHEEL_ONE_TURN,
                        KEY_API_WHEEL_LIST_ITEMS,
                        KEY_API_WHEEL_DATA,
                        KEY_API_WHEEL_INDEX
                };
                break;
            case CHAT:
                strAction = new String[]{
                        KEY_API_CHAT,
                        KEY_API_CHAT_TIME,
                        KEY_API_CHAT_USERNAME,
                        KEY_API_CHAT_USER_ID,
                        KEY_API_CHAT_USER_IDS,
                        KEY_API_CHAT_MESSAGE,
                        KEY_API_CHAT_DATA,
                        KEY_API_CHAT_MESSAGE_TYPE,
                        KEY_API_CHAT_MESSAGE_POSSITION,
                        KEY_API_CHAT_TYPE,
                        KEY_API_CHAT_CARD_ID,
                        KEY_API_CHAT_SINGAL,
                        KEY_API_CHAT_CARD_TYPE,
                        KEY_API_CHAT_DATA_LOCAL,
                        KEY_API_CHAT_IMAGE_URL,
                        KEY_API_CHAT_AUDIO_DURATION,
                        KEY_API_CHAT_CLIENT_MESSAGE_ID,
                        KEY_API_CHAT_STATE,
                        KEY_API_CHAT_STATE_DEFAULT,
                        KEY_API_CHAT_STATE_READ,
                        KEY_API_CHAT_STATUS_RECEIVE,
                        KEY_API_CHAT_STATUS_ERROR
                };
                break;
            case CHAT_GUILD:
                strAction = new String[]{
                        KEY_API_CHAT_GUILD_ID
                };
                break;
            case FRIENDS:
                ;
                break;
            case UPLOAD:
                ;
                break;
            case COMMENT:
                ;
                break;
            case FRIEND_GET_REQUEST:
                ;
                break;
            case FRIEND_GET_RECENT:
                ;
                break;
            case FRIEND_GET_SUGGEST:
                ;
                break;
            case FRIEND_GET_LIST_ALL:
                ;
                break;
            case FRIEND_GROUP_LIST:
                ;
                break;
            case GROUP_UPLOAD_IMAGE:
                ;
                break;
            case KEY_API_GROUP_IMAGE_UPLOAD_URL:
                ;
                break;
            case FRIEND_GROUP_CARD:
                ;
                break;
            case GET_GAME_BY_USER:
                ;
                break;
            case GROUP_ICON_LIST:
                ;
                break;
            case FRIEND_GROUP_DEAIL:
                ;
                break;
            case FRIEND_GET_LIST_CARD:
                ;
                break;
            case MENU_TAB:
                ;
                break;
            case GIFT_AWARD_INDEX:
                ;
                break;
            case SALE_GAME_INDEX:
                ;
                break;
            case GIFT_CODE_INDEX:
                ;
                break;
            case NEWS_FEED:
                ;
                break;
            case NOTIFICATION_INDEX:
                ;
                break;
            case NOTIFICATION_READ:
                ;
                break;
            case LOGIN:
                ;
                break;
            case GET_USER_INFOMATION:
                ;
                break;
            case GET_NOTIFICATION:
                ;
                break;
        }

        return strAction;
    }
}

package cn.nukkit.network.protocol;

import com.google.common.primitives.Ints;

import java.util.List;

/**
 * author: MagicDroidX &amp; iNevet
 * Nukkit Project
 */
public interface ProtocolInfo {

    /**
     * Actual Minecraft: PE protocol version
     */
    int CURRENT_PROTOCOL = Integer.valueOf("361"); //plugins can change it

    List<Integer> SUPPORTED_PROTOCOLS = Ints.asList(CURRENT_PROTOCOL);

    String MINECRAFT_VERSION = "v1.12.0";
    String MINECRAFT_VERSION_NETWORK = "1.12.0";

    short LOGIN_PACKET = 0x01;
    short PLAY_STATUS_PACKET = 0x02;
    short SERVER_TO_CLIENT_HANDSHAKE_PACKET = 0x03;
    short CLIENT_TO_SERVER_HANDSHAKE_PACKET = 0x04;
    short DISCONNECT_PACKET = 0x05;
    short RESOURCE_PACKS_INFO_PACKET = 0x06;
    short RESOURCE_PACK_STACK_PACKET = 0x07;
    short RESOURCE_PACK_CLIENT_RESPONSE_PACKET = 0x08;
    short TEXT_PACKET = 0x09;
    short SET_TIME_PACKET = 0x0a;
    short START_GAME_PACKET = 0x0b;
    short ADD_PLAYER_PACKET = 0x0c;
    short ADD_ENTITY_PACKET = 0x0d;
    short REMOVE_ENTITY_PACKET = 0x0e;
    short ADD_ITEM_ENTITY_PACKET = 0x0f;
    short TAKE_ITEM_ENTITY_PACKET = 0x11;
    short MOVE_ENTITY_ABSOLUTE_PACKET = 0x12;
    short MOVE_PLAYER_PACKET = 0x13;
    short RIDER_JUMP_PACKET = 0x14;
    short UPDATE_BLOCK_PACKET = 0x15;
    short ADD_PAINTING_PACKET = 0x16;
    short EXPLODE_PACKET = 0x17;
    short LEVEL_SOUND_EVENT_PACKET_V1 = 0x18;
    short LEVEL_EVENT_PACKET = 0x19;
    short BLOCK_EVENT_PACKET = 0x1a;
    short ENTITY_EVENT_PACKET = 0x1b;
    short MOB_EFFECT_PACKET = 0x1c;
    short UPDATE_ATTRIBUTES_PACKET = 0x1d;
    short INVENTORY_TRANSACTION_PACKET = 0x1e;
    short MOB_EQUIPMENT_PACKET = 0x1f;
    short MOB_ARMOR_EQUIPMENT_PACKET = 0x20;
    short INTERACT_PACKET = 0x21;
    short BLOCK_PICK_REQUEST_PACKET = 0x22;
    short ENTITY_PICK_REQUEST_PACKET = 0x23;
    short PLAYER_ACTION_PACKET = 0x24;
    short ENTITY_FALL_PACKET = 0x25;
    short HURT_ARMOR_PACKET = 0x26;
    short SET_ENTITY_DATA_PACKET = 0x27;
    short SET_ENTITY_MOTION_PACKET = 0x28;
    short SET_ENTITY_LINK_PACKET = 0x29;
    short SET_HEALTH_PACKET = 0x2a;
    short SET_SPAWN_POSITION_PACKET = 0x2b;
    short ANIMATE_PACKET = 0x2c;
    short RESPAWN_PACKET = 0x2d;
    short CONTAINER_OPEN_PACKET = 0x2e;
    short CONTAINER_CLOSE_PACKET = 0x2f;
    short PLAYER_HOTBAR_PACKET = 0x30;
    short INVENTORY_CONTENT_PACKET = 0x31;
    short INVENTORY_SLOT_PACKET = 0x32;
    short CONTAINER_SET_DATA_PACKET = 0x33;
    short CRAFTING_DATA_PACKET = 0x34;
    short CRAFTING_EVENT_PACKET = 0x35;
    short GUI_DATA_PICK_ITEM_PACKET = 0x36;
    short ADVENTURE_SETTINGS_PACKET = 0x37;
    short BLOCK_ENTITY_DATA_PACKET = 0x38;
    short PLAYER_INPUT_PACKET = 0x39;
    short FULL_CHUNK_DATA_PACKET = 0x3a;
    short SET_COMMANDS_ENABLED_PACKET = 0x3b;
    short SET_DIFFICULTY_PACKET = 0x3c;
    short CHANGE_DIMENSION_PACKET = 0x3d;
    short SET_PLAYER_GAME_TYPE_PACKET = 0x3e;
    short PLAYER_LIST_PACKET = 0x3f;
    short SIMPLE_EVENT_PACKET = 0x40;
    short EVENT_PACKET = 0x41;
    short SPAWN_EXPERIENCE_ORB_PACKET = 0x42;
    short CLIENTBOUND_MAP_ITEM_DATA_PACKET = 0x43;
    short MAP_INFO_REQUEST_PACKET = 0x44;
    short REQUEST_CHUNK_RADIUS_PACKET = 0x45;
    short CHUNK_RADIUS_UPDATED_PACKET = 0x46;
    short ITEM_FRAME_DROP_ITEM_PACKET = 0x47;
    short GAME_RULES_CHANGED_PACKET = 0x48;
    short CAMERA_PACKET = 0x49;
    short BOSS_EVENT_PACKET = 0x4a;
    short SHOW_CREDITS_PACKET = 0x4b;
    short AVAILABLE_COMMANDS_PACKET = 0x4c;
    short COMMAND_REQUEST_PACKET = 0x4d;
    short COMMAND_BLOCK_UPDATE_PACKET = 0x4e;
    short COMMAND_OUTPUT_PACKET = 0x4f;
    short UPDATE_TRADE_PACKET = 0x50;
    short UPDATE_EQUIPMENT_PACKET = 0x51;
    short RESOURCE_PACK_DATA_INFO_PACKET = 0x52;
    short RESOURCE_PACK_CHUNK_DATA_PACKET = 0x53;
    short RESOURCE_PACK_CHUNK_REQUEST_PACKET = 0x54;
    short TRANSFER_PACKET = 0x55;
    short PLAY_SOUND_PACKET = 0x56;
    short STOP_SOUND_PACKET = 0x57;
    short SET_TITLE_PACKET = 0x58;
    short ADD_BEHAVIOR_TREE_PACKET = 0x59;
    short STRUCTURE_BLOCK_UPDATE_PACKET = 0x5a;
    short SHOW_STORE_OFFER_PACKET = 0x5b;
    short PURCHASE_RECEIPT_PACKET = 0x5c;
    short PLAYER_SKIN_PACKET = 0x5d;
    short SUB_CLIENT_LOGIN_PACKET = 0x5e;
    short INITIATE_WEB_SOCKET_CONNECTION_PACKET = 0x5f;
    short SET_LAST_HURT_BY_PACKET = 0x60;
    short BOOK_EDIT_PACKET = 0x61;
    short NPC_REQUEST_PACKET = 0x62;
    short PHOTO_TRANSFER_PACKET = 0x63;
    short MODAL_FORM_REQUEST_PACKET = 0x64;
    short MODAL_FORM_RESPONSE_PACKET = 0x65;
    short SERVER_SETTINGS_REQUEST_PACKET = 0x66;
    short SERVER_SETTINGS_RESPONSE_PACKET = 0x67;
    short SHOW_PROFILE_PACKET = 0x68;
    short SET_DEFAULT_GAME_TYPE_PACKET = 0x69;
    short MOVE_ENTITY_DELTA_PACKET = 0x6f;
    short SET_SCOREBOARD_IDENTITY_PACKET = 0x70;
    short SET_LOCAL_PLAYER_AS_INITIALIZED_PACKET = 0x71;
    short UPDATE_SOFT_ENUM_PACKET = 0x72;
    short NETWORK_STACK_LATENCY_PACKET = 0x73;

    short SCRIPT_CUSTOM_EVENT_PACKET = 0x75;
    short SPAWN_PARTICLE_EFFECT_PACKET = 0x76;
    short AVAILABLE_ENTITY_IDENTIFIERS_PACKET = 0x77;
    short LEVEL_SOUND_EVENT_PACKET_V2 = 0x78;
    short NETWORK_CHUNK_PUBLISHER_UPDATE_PACKET = 0x79;
    short BIOME_DEFINITION_LIST_PACKET = 0x7a;
    short LEVEL_SOUND_EVENT_PACKET = 0x7b;
    short LEVEL_EVENT_GENERIC_PACKET = 0x7c;
    short LECTERN_UPDATE_PACKET = 0x7d;
    short VIDEO_STREAM_CONNECT_PACKET = 0x7e;
    //short ADD_ENTITY_PACKET = 0x7f;
    //short REMOVE_ENTITY_PACKET = 0x80;
    short CLIENT_CACHE_STATUS_PACKET = 0x81;
    short ON_SCREEN_TEXTURE_ANIMATION_PACKET = 0x82;
    short MAP_CREATE_LOCKED_COPY_PACKET = 0x83;
    short STRUCTURE_TEMPLATE_DATA_EXPORT_REQUEST = 0x84;
    short STRUCTURE_TEMPLATE_DATA_EXPORT_RESPONSE = 0x85;
    short UPDATE_BLOCK_PROPERTIES = 0x86;
    short CLIENT_CACHE_BLOB_STATUS_PACKET = 0x87;
    short CLIENT_CACHE_MISS_RESPONSE_PACKET = 0x88;

    short BATCH_PACKET = 0xff;
}

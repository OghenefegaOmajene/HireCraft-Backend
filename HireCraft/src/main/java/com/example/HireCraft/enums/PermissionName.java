package com.example.HireCraft.enums;

public enum PermissionName {
    //Admin Mgmt
    DELETE_USER,
    SUSPEND_USER,
    UPDATE_USER_ROLE,

    //Employer Permissions
    BOOK_PROVIDER,
    ADD_REVIEW,
    ADD_RATING,

    //Provider Permissions
    ACCEPT_BOOKING_REQUEST,
    DECLINE_BOOKING_REQUEST,

    //User Mgmt
    VIEW_USER_PROFILE,
    EDIT_USER_PROFILE, //restricted to only your account
    DELETE_USER_ACCOUNT, //restricted to only your account

    //System Settings
    MANAGE_SETTINGS
}

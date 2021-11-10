package com.example.myandroiddatabasemanager

object CreateTable {
    const val PROJECT_NAME = "AMANHICOV2020"
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORMS = ("CREATE TABLE test " + "("
            + "ID INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "NME TEXT,"
            + "SALARY TEXT"
            + " );");
}
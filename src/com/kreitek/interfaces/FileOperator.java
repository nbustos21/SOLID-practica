package com.kreitek.interfaces;

public interface FileOperator {
    void write(byte[] buffer);
    void open();
    void close();

}
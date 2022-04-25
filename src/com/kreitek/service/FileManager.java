package com.kreitek.service;

import com.kreitek.files.info.FileSystemItemBase;

public class FileManager {

    public static int calculateSize(FileSystemItemBase fileItem) {
        return fileItem.getSize();
    }
    // Aquí habría otros métodos para gestionar ficheros y directorios:
    // Crear ficheros, mover ficheros, eliminar ficheros, etc.
}
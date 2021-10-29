package com.example.yalo.csvReader;

import java.util.Objects;

public class csvReader {
     String fileName;
     String filePath;

    public csvReader(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof csvReader)) return false;
        csvReader csvReader = (csvReader) o;
        return Objects.equals(fileName, csvReader.fileName) && Objects.equals(filePath, csvReader.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, filePath);
    }
}

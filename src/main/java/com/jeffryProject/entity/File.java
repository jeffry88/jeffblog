package com.jeffryProject.entity;

import java.util.Date;

public class File {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_file.file_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_file.file_name
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String fileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_file.file_url
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String fileUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_file.upload_time
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Date uploadTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_file.type
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_file.file_id
     *
     * @return the value of jeff_file.file_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_file.file_id
     *
     * @param fileId the value for jeff_file.file_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_file.file_name
     *
     * @return the value of jeff_file.file_name
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_file.file_name
     *
     * @param fileName the value for jeff_file.file_name
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_file.file_url
     *
     * @return the value of jeff_file.file_url
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_file.file_url
     *
     * @param fileUrl the value for jeff_file.file_url
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_file.upload_time
     *
     * @return the value of jeff_file.upload_time
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_file.upload_time
     *
     * @param uploadTime the value for jeff_file.upload_time
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_file.type
     *
     * @return the value of jeff_file.type
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_file.type
     *
     * @param type the value for jeff_file.type
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}
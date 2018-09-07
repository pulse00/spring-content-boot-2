package com.example.demo;

import org.springframework.content.commons.annotations.ContentId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class DemoContent {

  @Id
  public String id;

  @ContentId
  private String contentId;

}

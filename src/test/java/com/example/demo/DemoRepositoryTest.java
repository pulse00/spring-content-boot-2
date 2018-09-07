package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@TestPropertySource(properties = "spring.content.s3.bucket=TODO_SET_BUCKET" )
public class DemoRepositoryTest {

  @Autowired
  private DemoContentRepository repository;

  @Autowired
  private DemoContentStore store;

  @Test
  public void testStorage() {
    DemoContent content = new DemoContent();
    repository.save(content);
    Assert.assertEquals(1, repository.count());
    ByteArrayInputStream data = new ByteArrayInputStream("foo".getBytes());
    store.setContent(content, data);
  }

}

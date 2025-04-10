package com.product.star.homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContactMain {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ContactConfiguration.class);

        var contactDao = applicationContext.getBean(ContactDao.class);
        var contact = contactDao.getContact(1000L);
        System.out.println(contact);
    }
}

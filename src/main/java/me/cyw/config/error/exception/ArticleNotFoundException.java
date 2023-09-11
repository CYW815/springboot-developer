package me.cyw.config.error.exception;

import me.cyw.config.error.ErrorCode;

public class ArticleNotFoundException extends NotFoundException{
    public ArticleNotFoundException() {
        super(ErrorCode.ARTICLE_NOT_FOUND);
    }
}

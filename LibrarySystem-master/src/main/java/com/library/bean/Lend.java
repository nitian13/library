package com.library.bean;

import java.io.Serializable;
import java.util.Date;

public class Lend implements Serializable {

    //借书记录的序号
    private long ser_num;

    //书的id
    private long book_id;

    //读者id
    private long reader_id;

    //借书时间
    private Date lend_date;

    //还书时间
    private Date back_date;

    public long getReaderId() {
        return reader_id;
    }

    public void setReaderId(long reader_id) {
        this.reader_id = reader_id;
    }

    public long getBookId() {
        return book_id;
    }

    public void setBookId(long book_id) {
        this.book_id = book_id;
    }

    public void setSer_num(long ser_num) {
        this.ser_num = ser_num;
    }

    public Date getBackDate() {
        return back_date;
    }

    public void setBackDate(Date back_date) {
        this.back_date = back_date;
    }

    public Date getLendDate() {
        return lend_date;
    }

    public void setLendDate(Date lend_date) {
        this.lend_date = lend_date;
    }

    public long getSer_num() {
        return ser_num;
    }
}

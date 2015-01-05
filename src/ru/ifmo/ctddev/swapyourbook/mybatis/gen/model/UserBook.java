package ru.ifmo.ctddev.swapyourbook.mybatis.gen.model;

public class UserBook {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book.userBookID
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    private Integer userbookid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book.userID
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book.bookID
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    private Integer bookid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book.type
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    private Integer type;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_book
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public UserBook(Integer userbookid, Integer userid, Integer bookid, Integer type) {
        this.userbookid = userbookid;
        this.userid = userid;
        this.bookid = bookid;
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_book
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public UserBook() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book.userBookID
     *
     * @return the value of user_book.userBookID
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public Integer getUserbookid() {
        return userbookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book.userBookID
     *
     * @param userbookid the value for user_book.userBookID
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public void setUserbookid(Integer userbookid) {
        this.userbookid = userbookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book.userID
     *
     * @return the value of user_book.userID
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book.userID
     *
     * @param userid the value for user_book.userID
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book.bookID
     *
     * @return the value of user_book.bookID
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public Integer getBookid() {
        return bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book.bookID
     *
     * @param bookid the value for user_book.bookID
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book.type
     *
     * @return the value of user_book.type
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book.type
     *
     * @param type the value for user_book.type
     *
     * @mbggenerated Sun Jan 04 21:52:04 MSK 2015
     */
    public void setType(Integer type) {
        this.type = type;
    }
}
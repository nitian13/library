package com.library.dao;

import com.library.bean.Lend;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class LendDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    private final static String NAMESPACE = "com.library.dao.LendDao.";

    //还书，把还书时间设置为当前时间，条件是"book_id"字段等于"#{book_id}"参数并且"reader_id"字段等于"#{reader_id}"参数并且"back_date"字段为null
    public int returnBookOne(final long book_id, long reader_id) {
        Map<String, Object> map = new HashMap<>();
        map.put("book_id", book_id);
        map.put("reader_id", reader_id);
        return sqlSessionTemplate.update(NAMESPACE + "returnBookOne", map);
    }

    //更改书的数量，还书后书的数量+1
    public int returnBookTwo(final long book_id) {
        return sqlSessionTemplate.update(NAMESPACE + "returnBookTwo", book_id);
    }

    //添加一条借书记录
    public int lendBookOne(final long book_id, final long reader_id) {
        Map<String, Object> map = new HashMap<>();
        map.put("book_id", book_id);
        map.put("reader_id", reader_id);
        return sqlSessionTemplate.insert(NAMESPACE + "lendBookOne", map);
    }

    //修改书的数量，借出一本书，书的数量-1
    public int lendBookTwo(final long book_id) {
        return sqlSessionTemplate.update(NAMESPACE + "lendBookTwo", book_id);
    }

    //所有借书记录
    public ArrayList<Lend> lendList() {
        List<Lend> result = sqlSessionTemplate.selectList(NAMESPACE + "lendList");
        return (ArrayList<Lend>) result;
    }

    //根据读者的id去查询借阅记录
    public ArrayList<Lend> myLendList(final long reader_id) {
        List<Lend> result = sqlSessionTemplate.selectList(NAMESPACE + "myLendList", reader_id);
        return (ArrayList<Lend>) result;
    }

    //根据借书列表的序号去删除记录
    public int deleteLend(final long ser_num) {
        return sqlSessionTemplate.delete(NAMESPACE + "deleteLend", ser_num);
    }
}

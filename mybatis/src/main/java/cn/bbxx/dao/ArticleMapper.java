package cn.bbxx.dao;

import cn.bbxx.pojo.Article;
import cn.bbxx.pojo.User;

import java.util.List;

public interface ArticleMapper {
    public List<Article> select();

    // 查询所有
    public List<Article> selectCondition(Article article);

    // 新增
    public boolean insert(Article article);
    // 删除
    public boolean delete(Article article);
    public boolean delete(Integer id);

    // 一对多查询
    public List<User> selectUserAndArticle(String username);
}
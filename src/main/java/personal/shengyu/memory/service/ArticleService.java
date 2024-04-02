package personal.shengyu.memory.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import personal.shengyu.memory.config.PoetryResult;
import personal.shengyu.memory.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import personal.shengyu.memory.vo.ArticleVO;
import personal.shengyu.memory.vo.BaseRequestVO;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author sara
 * @since 2021-08-13
 */
public interface ArticleService extends IService<Article> {

    PoetryResult saveArticle(ArticleVO articleVO);

    PoetryResult deleteArticle(Integer id);

    PoetryResult updateArticle(ArticleVO articleVO);

    PoetryResult<Page> listArticle(BaseRequestVO baseRequestVO);

    PoetryResult<ArticleVO> getArticleById(Integer id, String password);

    PoetryResult<Page> listAdminArticle(BaseRequestVO baseRequestVO, Boolean isBoss);

    PoetryResult<ArticleVO> getArticleByIdForUser(Integer id);

    PoetryResult<Map<Integer, List<ArticleVO>>> listSortArticle();
}

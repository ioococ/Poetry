package personal.shengyu.memory.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import personal.shengyu.memory.config.PoetryResult;
import personal.shengyu.memory.dao.DiaryMapper;
import personal.shengyu.memory.domain.Diary;
import personal.shengyu.memory.domain.vo.BaseRequestVO;
import personal.shengyu.memory.service.DiaryService;
import personal.shengyu.memory.utils.CommonQuery;

import java.util.List;

/**
 * <p>
 * 日记表 服务实现类
 * </p>
 *
 * @author sara
 * @since 2021-08-13
 */
@Service
public class DiaryServiceImpl extends ServiceImpl<DiaryMapper, Diary> implements DiaryService {

    @Autowired
    private CommonQuery commonQuery;

    @Override
    public PoetryResult listDiary(BaseRequestVO baseRequestVO) {
        List<Integer> ids = null;

        LambdaQueryChainWrapper<Diary> lambdaQuery = lambdaQuery();
        lambdaQuery.in(!CollectionUtils.isEmpty(ids), Diary::getId, ids);
        lambdaQuery.like(StringUtils.hasText(baseRequestVO.getSearchKey()), Diary::getTitle, baseRequestVO.getSearchKey());

        if (baseRequestVO.getCategory() != null) lambdaQuery.eq(Diary::getCategory, baseRequestVO.getCategory());
        if (baseRequestVO.getWeather() != null) lambdaQuery.eq(Diary::getWeather, baseRequestVO.getWeather());
        if (baseRequestVO.getTemperature() != null) lambdaQuery.eq(Diary::getTemperature, baseRequestVO.getTemperature());

        lambdaQuery.page(baseRequestVO);

        return PoetryResult.success(baseRequestVO);
    }
}

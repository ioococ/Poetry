package personal.shengyu.memory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.shengyu.memory.config.PoetryResult;
import personal.shengyu.memory.domain.Diary;
import personal.shengyu.memory.domain.Mail;
import personal.shengyu.memory.domain.vo.BaseRequestVO;

/**
 * <p>
 * 日记表 服务类
 * </p>
 *
 * @author sara
 * @since 2021-08-13
 */
public interface DiaryService extends IService<Diary> {

    PoetryResult listDiary(BaseRequestVO baseRequestVO);

}

package personal.shengyu.memory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import personal.shengyu.memory.config.LoginCheck;
import personal.shengyu.memory.config.PoetryResult;
import personal.shengyu.memory.domain.Diary;
import personal.shengyu.memory.domain.vo.BaseRequestVO;
import personal.shengyu.memory.service.DiaryService;
import personal.shengyu.memory.utils.CommonConst;
import personal.shengyu.memory.utils.PoetryCache;
import personal.shengyu.memory.utils.PoetryUtil;

/**
 * @Author: nekotako
 * @Date: 06/04/2024 21:07 Saturday
 */

@RestController
@RequestMapping("/diary")
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    /**
     * 保存
     */
    @PostMapping("/saveDiary")
    @LoginCheck
    public PoetryResult saveDiary(@Validated @RequestBody Diary diary) {
        Integer userId = PoetryUtil.getUserId();

        diaryService.save(diary);

        if (userId.intValue() == PoetryUtil.getAdminUser().getId().intValue()) {
//            PoetryCache.put(CommonConst.DIART_LIST, diary);
        }
//        PoetryCache.remove(CommonConst.FAMILY_LIST);
        return PoetryResult.success();
    }

    /**
     * 修改
     */
    @PostMapping("/updateDiary")
    @LoginCheck
    public PoetryResult updateDiary(@Validated @RequestBody Diary diary) {
        Integer userId = PoetryUtil.getUserId();

        diaryService.updateById(diary);

        if (userId.intValue() == PoetryUtil.getAdminUser().getId().intValue()) {
//            PoetryCache.put(CommonConst.DIART_LIST, diary);
        }
        return PoetryResult.success();
    }

    /**
    * 查询文章
    */


    /**
     * 获取
     */
    @GetMapping("/getDiaryById")
    @LoginCheck
    public PoetryResult<Diary> getDiary(@RequestParam("id") Integer id) {
        Diary diary = diaryService.lambdaQuery().eq(Diary::getId, id).one();
        return PoetryResult.success(diary);
    }

    /**
     * 删除
     */
    @GetMapping("/deleteDiary")
    @LoginCheck
    public PoetryResult deleteDiary(@RequestParam("id") Integer id) {
        diaryService.removeById(id);
        PoetryCache.remove(CommonConst.DIART_LIST);
        return PoetryResult.success();
    }

    @RequestMapping("/listDiary")
    public PoetryResult listDiary(@RequestBody BaseRequestVO baseRequestVO) {
        return diaryService.listDiary(baseRequestVO);
//        return PoetryResult.success(diaryService.lambdaQuery().list());
    }

}

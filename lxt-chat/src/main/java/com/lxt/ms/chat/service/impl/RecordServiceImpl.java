package com.lxt.ms.chat.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lxt.ms.chat.mapper.ChatRecordMapper;
import com.lxt.ms.chat.mapper.ext.ChatRecordExtMapper;
import com.lxt.ms.chat.model.ChatRecord;
import com.lxt.ms.chat.model.ChatRecordExample;
import com.lxt.ms.chat.service.api.RecordService;
import com.lxt.ms.common.bean.web.Packages;
import com.lxt.ms.common.bean.web.PageData;
import com.lxt.ms.common.exception.APIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service("recordService")
public class RecordServiceImpl implements RecordService {

    @Autowired
    private ChatRecordMapper cRecordMapper;

    @Autowired
    private ChatRecordExtMapper chatRecordExtMapper;

    @Override
    public Packages list(HashMap<String, Object> example, PageData pageData) throws APIException {
        Page page = PageHelper.startPage(pageData.getPageNumber(), pageData.getPageSize(), true);

        Packages pkg = new Packages();

        System.out.println("example:"+example);
        System.out.println("pagedata:"+pageData);

        long time = (Long) example.get("beforeDate");
        String sendId = (String) example.get("sendId");
        String receiveId = (String) example.get("receiveId");
        example.put("insertTime", new Date(time));
        example.put("startIndex", (pageData.getPageNumber()-1)*pageData.getPageSize());
        example.put("pageSize", pageData.getPageSize());

//        ChatRecordExample chatRecordExample = new ChatRecordExample();
//        chatRecordExample.createCriteria().andInsertTimeLessThan(new Date(time)).andOrUserId(sendId, receiveId);
//        chatRecordExample.setOrderByClause("INSERT_TIME desc");
//        List<ChatRecord> list = chatRecordMapper.selectByExample(chatRecordExample);
        List<ChatRecord> list = chatRecordExtMapper.queryRecord(example);
        int count = chatRecordExtMapper.queryRecordCount(example);
        pageData.setData(list);
        pageData.setTotal(count);
        pkg.getBody().setData(pageData);

        return pkg;
    }
}

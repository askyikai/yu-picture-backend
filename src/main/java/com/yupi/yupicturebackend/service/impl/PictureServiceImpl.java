package com.yupi.yupicturebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.yupicturebackend.model.entity.Picture;
import com.yupi.yupicturebackend.service.PictureService;
import com.yupi.yupicturebackend.mapper.PictureMapper;
import org.springframework.stereotype.Service;

/**
* @author ken
* @description 针对表【picture(图片)】的数据库操作Service实现
* @createDate 2025-03-24 19:54:21
*/
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture>
    implements PictureService{

}





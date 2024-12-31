package com.dimple.dimpleSearch.esdao;

import com.dimple.dimpleSearch.model.dto.post.PostEsDTO;
import com.dimple.dimpleSearch.model.dto.post.PostQueryRequest;
import com.dimple.dimpleSearch.model.entity.Post;
import com.dimple.dimpleSearch.service.PostService;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

/**
 * 帖子 ES 操作测试
 *
* @author dimple
 */
@SpringBootTest
public class PostEsDaoTest {

    @Resource
    private PostEsDao postEsDao;

    @Resource
    private PostService postService;


}

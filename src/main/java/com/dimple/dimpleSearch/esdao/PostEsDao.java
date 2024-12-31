package com.dimple.dimpleSearch.esdao;

import com.dimple.dimpleSearch.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
* @author dimple
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

}
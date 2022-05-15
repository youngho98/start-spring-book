package com.hoy.startspringbook.domain.posts;

import com.hoy.startspringbook.web.dto.PostsListResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts,
        Long> {
    PostsListResponseDto findAllDesc();
}

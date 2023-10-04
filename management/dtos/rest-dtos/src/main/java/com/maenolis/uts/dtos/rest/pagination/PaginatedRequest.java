package com.maenolis.uts.dtos.rest.pagination;

public record PaginatedRequest(int page, int size, PageOrdering pageOrdering) {
}

package club.bluetroy.crawler.filter.impl;

import club.bluetroy.crawler.filter.AbstractMovieFilter;

/**
 * @author heyixin
 * Date: 2019-01-26
 * Time: 18:34
 */
abstract class AbstractCompositeMovieFilter extends AbstractMovieFilter {
    /**
     * 添加movieFilter
     *
     * @param abstractMovieFilter movieFilter
     */
    abstract void addFilter(AbstractMovieFilter abstractMovieFilter);
}

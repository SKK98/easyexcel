package com.alibaba.excel.analysis;

import java.util.List;

import com.alibaba.excel.read.metadata.ReadSheet;

/**
 * Excel file Executor
 *
 * @author zhuangjiaju
 */
public interface ExcelExecutor {

    /**
     * Returns the actual sheet in excel
     * 
     * @return
     */
    List<ReadSheet> sheetList();

    /**
     * Read sheet
     */
    void execute();

}

package com.index.webapp.sys.origin.service;

import com.index.webapp.sys.origin.entity.Origin;
import com.index.webapp.sys.origin.entity.RecordOrigin;
import com.index.webapp.sys.origin.tree.EntityTree;
import com.webapp.support.page.PageResult;

import java.util.List;


public interface RecordOriginService {

    List<EntityTree> listAllRecordOrigin();

    PageResult listRecordOrigin(int currPage, int pageSize);

    void addRecordOrigin(RecordOrigin recordOrigin);

    void deleteById(String originId);

    List<String> getReportOriginForOrganizationUser(int currUserId);

    String addParentOriginName(String originId, List<Origin> allOriginList);
}

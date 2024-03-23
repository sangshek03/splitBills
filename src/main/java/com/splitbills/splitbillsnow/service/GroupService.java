package com.splitbills.splitbillsnow.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.splitbills.splitbillsnow.jpa.GroupRepository;
import com.splitbills.splitbillsnow.model.Group;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    public Optional<Group> getGroupById(int groupId) {
        return groupRepository.findById(groupId);
    }

    public Group createGroup(Group group) {
        return groupRepository.save(group);
    }

    public Group updateGroup(Group group) {
        return groupRepository.save(group);
    }

    public void deleteGroup(int groupId) {
        groupRepository.deleteById(groupId);
    }
}
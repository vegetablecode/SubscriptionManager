package com.vegetablecode.SubMgBackend.web;

import com.vegetablecode.SubMgBackend.domain.Agreement;
import com.vegetablecode.SubMgBackend.domain.Task;
import com.vegetablecode.SubMgBackend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.vegetablecode.SubMgBackend.service.MapValidationErrorService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/agreement")
@CrossOrigin
public class AgreementController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("/{agreement_id}")
    public ResponseEntity<?> addTaskToAgreement(@Valid @RequestBody Task task, BindingResult result, @PathVariable String agreement_id) {

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) return  errorMap;

        Task task1 = taskService.addTask(agreement_id, task);
        return new ResponseEntity<Task>(task1, HttpStatus.CREATED);
    }

    @GetMapping("/{agreement_id}")
    public Iterable<Task> getAgreement(@PathVariable String agreement_id) {
        return taskService.findBacklogById(agreement_id);
    }

    @GetMapping("/{agreement_id}/{task_id}")
    public ResponseEntity<?> getTask(@PathVariable String agreement_id, @PathVariable String task_id) {
        Task task = taskService.findTaskByClientSequence(agreement_id, task_id);
        return new ResponseEntity<Task>(task, HttpStatus.OK);
    }

    @PatchMapping("/{agreement_id}/{task_id}")
    public ResponseEntity<?> updateTask(@Valid @RequestBody Task task, BindingResult result, @PathVariable String agreement_id, @PathVariable String task_id) {
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) return errorMap;

        Task updatedTask = taskService.updateByClientSequence(task, agreement_id, task_id);
        return new ResponseEntity<Task>(updatedTask, HttpStatus.OK);
    }

    @DeleteMapping("/{agreement_id}/{task_id}")
    public ResponseEntity<?> deleteTask(@Valid @RequestBody Task task, BindingResult result, @PathVariable String agreement_id, @PathVariable String task_id) {
        taskService.deleteTaskByClientSequence(agreement_id, task_id);
        return new ResponseEntity<String>("Task '" + task_id + "' was deleted!", HttpStatus.OK);
    }
}

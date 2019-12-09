package com.escodro.domain.di

import com.escodro.domain.calendar.TaskCalendar
import com.escodro.domain.usecase.category.DeleteCategory
import com.escodro.domain.usecase.category.LoadAllCategories
import com.escodro.domain.usecase.category.LoadCategory
import com.escodro.domain.usecase.category.UpsertCategory
import com.escodro.domain.usecase.task.AddTask
import com.escodro.domain.usecase.task.CompleteTask
import com.escodro.domain.usecase.task.DeleteTask
import com.escodro.domain.usecase.task.GetFutureTasks
import com.escodro.domain.usecase.task.GetTask
import com.escodro.domain.usecase.task.SnoozeTask
import com.escodro.domain.usecase.task.UncompleteTask
import com.escodro.domain.usecase.task.UpdateTask
import com.escodro.domain.usecase.task.UpdateTaskStatus
import com.escodro.domain.usecase.taskwithcategory.LoadCompletedTasks
import com.escodro.domain.usecase.taskwithcategory.LoadTasksByCategory
import com.escodro.domain.usecase.taskwithcategory.LoadUncompletedTasks
import com.escodro.domain.usecase.tracker.LoadCompletedTasksByPeriod
import org.koin.dsl.module

/**
 * Domain dependency injection module.
 */
val domainModule = module {
    factory { AddTask(get()) }
    factory { CompleteTask(get(), get()) }
    factory { UncompleteTask(get()) }
    factory { UpdateTaskStatus(get(), get(), get()) }
    factory { DeleteTask(get()) }
    factory { GetFutureTasks(get()) }
    factory { GetTask(get()) }
    factory { SnoozeTask(get()) }
    factory { UpdateTask(get()) }

    factory { DeleteCategory(get()) }
    factory { LoadAllCategories(get()) }
    factory { LoadCategory(get()) }
    factory { UpsertCategory(get()) }

    factory { LoadTasksByCategory(get(), get()) }
    factory { LoadCompletedTasks(get()) }
    factory { LoadUncompletedTasks(get()) }

    factory { LoadCompletedTasksByPeriod(get()) }

    factory { TaskCalendar() }
}
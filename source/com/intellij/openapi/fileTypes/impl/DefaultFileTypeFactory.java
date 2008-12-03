/*
 * Copyright (c) 2000-2007 JetBrains s.r.o. All Rights Reserved.
 */
package com.intellij.openapi.fileTypes.impl;

import com.intellij.ide.highlighter.*;
import com.intellij.lang.properties.PropertiesFileType;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.intellij.openapi.vcs.changes.patch.PatchFileType;
import org.jetbrains.annotations.NotNull;

/**
 * @author peter
 */
public class DefaultFileTypeFactory extends FileTypeFactory {
  public void createFileTypes(@NotNull final FileTypeConsumer consumer) {
    consumer.consume(new JavaClassFileType(), "class");

    consumer.consume(new JavaFileType(), "java");

    consumer.consume(new GuiFormFileType(), GuiFormFileType.DEFAULT_EXTENSION);
    consumer.consume(new WorkspaceFileType(), WorkspaceFileType.DEFAULT_EXTENSION);
    consumer.consume(new ModuleFileType(), ModuleFileType.DEFAULT_EXTENSION);
    consumer.consume(new ProjectFileType(), ProjectFileType.DEFAULT_EXTENSION);
    consumer.consume(PropertiesFileType.FILE_TYPE, PropertiesFileType.DEFAULT_EXTENSION);
    consumer.consume(new PatchFileType(), "patch;diff");
  }

}

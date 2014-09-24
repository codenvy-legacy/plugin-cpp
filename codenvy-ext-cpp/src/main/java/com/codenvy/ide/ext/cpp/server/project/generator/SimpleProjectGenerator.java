/*******************************************************************************
 * Copyright (c) 2012-2014 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.ide.ext.cpp.server.project.generator;

import com.codenvy.api.core.ConflictException;
import com.codenvy.api.core.ForbiddenException;
import com.codenvy.api.core.ServerException;
import com.codenvy.api.project.server.FolderEntry;
import com.codenvy.api.project.server.ProjectGenerator;
import com.google.inject.Singleton;

import java.util.Map;

/** @author Vladyslav Zhukovskii */
@Singleton
public class SimpleProjectGenerator implements ProjectGenerator {

    private static final String HELLO_CONTENT = "// Simple Hello World\n" +
                                                "\n" +
                                                "#include <iostream>\n" +
                                                "\n" +
                                                "int main()\n" +
                                                "{\n" +
                                                "\tstd::cout << \"Hello World!\" << std::endl;\n" +
                                                "\treturn 0;\n" +
                                                "}";

    private static final String MAKEFILE_CONTENT = "all:\n" +
                                                   "\tg++ hello.cc";

    @Override
    public String getId() {
        return "cpp-simple";
    }

    @Override
    public void generateProject(FolderEntry baseFolder, Map<String, String> options)
            throws ForbiddenException, ConflictException, ServerException {
        baseFolder.createFile("hello.cc", HELLO_CONTENT.getBytes(), "text/x-c");
        baseFolder.createFile("Makefile", MAKEFILE_CONTENT.getBytes(), "text/x-makefile");
    }
}

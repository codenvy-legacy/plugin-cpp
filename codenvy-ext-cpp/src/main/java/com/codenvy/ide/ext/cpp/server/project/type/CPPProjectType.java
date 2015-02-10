/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.ide.ext.cpp.server.project.type;

import com.codenvy.api.project.server.type.ProjectType;
import com.codenvy.api.project.shared.Constants;
import com.codenvy.ide.ext.cpp.shared.ProjectAttributes;

/**
 * @author Vitaly Parfonov
 */
public class CPPProjectType extends ProjectType {

    public CPPProjectType() {
        super(ProjectAttributes.CPP_ID, ProjectAttributes.CPP_NAME, true, false);
        addConstantDefinition(Constants.LANGUAGE, "language", ProjectAttributes.PROGRAMMING_LANGUAGE);
    }
}

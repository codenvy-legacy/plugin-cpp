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
package com.codenvy.ide.ext.cpp.server.inject;

import com.codenvy.ide.ext.cpp.server.project.type.CPPProjectTypeDescriptionExtension;
import com.codenvy.ide.ext.cpp.server.project.type.CPPProjectTypeExtension;
import com.codenvy.inject.DynaModule;
import com.google.inject.AbstractModule;

@DynaModule
public class CPPModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CPPProjectTypeExtension.class);
        bind(CPPProjectTypeDescriptionExtension.class);
    }
}

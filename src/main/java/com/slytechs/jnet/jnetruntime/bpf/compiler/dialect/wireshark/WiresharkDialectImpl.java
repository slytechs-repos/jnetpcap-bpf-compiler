/*
 * Sly Technologies Free License
 * 
 * Copyright 2024 Sly Technologies Inc.
 *
 * Licensed under the Sly Technologies Free License (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.slytechs.com/free-license-text
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.slytechs.jnet.jnetruntime.bpf.compiler.dialect.wireshark;

import com.slytechs.jnet.jnetruntime.bpf.compiler.api.CompilerDialect;
import com.slytechs.jnet.jnetruntime.bpf.compiler.api.CompilerException;
import com.slytechs.jnet.jnetruntime.bpf.compiler.frontend.Lexer;
import com.slytechs.jnet.jnetruntime.bpf.compiler.frontend.Parser;

/**
 * @author Mark Bednarczyk
 *
 */
public class WiresharkDialectImpl implements CompilerDialect<WiresharkTokenType, WiresharkASTNode> {

	/**
	 * @see com.slytechs.jnet.jnetruntime.bpf.compiler.api.CompilerDialect#getName()
	 */
	@Override
	public String getName() {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.jnetruntime.bpf.compiler.api.CompilerDialect#createLexer(java.lang.String)
	 */
	@Override
	public Lexer<WiresharkTokenType> createLexer(String source) throws CompilerException {
		throw new UnsupportedOperationException("not implemented yet");
	}

	/**
	 * @see com.slytechs.jnet.jnetruntime.bpf.compiler.api.CompilerDialect#createParser(com.slytechs.jnet.jnetruntime.bpf.compiler.frontend.Lexer)
	 */
	@Override
	public Parser<WiresharkTokenType, WiresharkASTNode> createParser(Lexer<WiresharkTokenType> lexer) throws CompilerException {
		throw new UnsupportedOperationException("not implemented yet");
	}

}

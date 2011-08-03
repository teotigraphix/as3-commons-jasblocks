/*fpkg*/package foo.bar {
	import foo;
	[MetaTag]
	CONFIG::debug { 
		import foo.*; 
		[Event] 
		include 'my.as';
		trace('me'); 
		if (true) { foo; } 
	}
	include 'your.as';
	[Tag(true)]
	import boo.bar.*;
	use namespace outer_space;
	/**
	 * as doc
	 */
	public class Foo/*f*/ extends Ding::Bat implements foo.bar.Goo, IPod {
		{
			Foo.init();
			goo.ber.Blop;
		}
		CONFIG::debug {
			import debug.*;
			private var debug1:int = 1;  
			private var debug2:int = 2;
			[Event]
			internal function debugMe(arg, ...args):void{}
		}
		[Annotate]
		[Basic()]
		[String("foo")]
		[Num(1)]
		[Bool(false)]
		[Arg(foo="bar")]
		[List(foo="bar", that=2)]
		[Event("beta")]		
		public var foo:foo.BarBaz = new BarBaz(42);
		/** javadoc? */
		my_namespace static function func(arg:Number,arg1:*=undefined, foo=null, ...):Boolean {
			var rsl:Vector.<RSLData> = Vector.<RSLData>(rslDataList[event.rslIndex]);
			var v:Vector.<int>=new <Vector.<int>> [new <int> [1], new <int> [1]]; 
			CONFIG::debug { 
				var perfUtil:Pref = new Pref();
				perfUtil.startSampling();
			}
//			default xml namespace = "http://example.com/";
			for (var b:int=1;b<=10;b++) { bar(); }
			for (;;) { break; }
			for (var g in blah) { r(); }
			for each (var g:Object in baz[goo]) { r(); }
			if (h==undefined) { throw new Error(); } else { /* bar */ }
			if (a) b();
			while (false) v();
			do { continue; } while (m);
			switch (blah) {
				case 3: x(); y();
				case 4: next; break one;
				default: x(); y();
			}
			try {
				with (scope) foo();
			} catch (e) {
				var a=b?(x+y):new Foo();
			} catch (f:Error) {
				const X=new Thing();
			}
			try {
				foo();
			} finally {
				ff = function(y, z, ...args):String { return "42"; };
			}
			myLabel : {
				foo;
			}
			l=[1,'2'];
			xx = doc.ns::name;
			m={a:null,b:{a:1,b:foo(42),c:[1,2,3]}};
			hex = 0x3;
//			d = <foo bar="{blat}"/>;
//			d = <foo bar="baz"/>;
			r = /regexp/ms;
			a = b.(@c);
			zz = a..b;
			zzz = a..@*;
			zzzz = a..@["foo"+b];
			/* unary expressions */
			--a; ++a; a--; a++; a = -a;
			return a.call(i.j*k, l[m]);
//			return ASTLiteralBuilder.newXMLLiteral(xml);
		
		}
		override outer_space function get foobar():Vector.<Vector.<int>>
		{
			return null;
		}		
	}
}
[InnerMeta]
import inner.*;
class InnerClass {
	public var f:int;
}
function funcInner():void
{
	return;
}
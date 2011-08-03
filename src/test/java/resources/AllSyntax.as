/*fpkg*/package foo.bar {
	import pkg.Stuff;
	import IStuff;
	import pkg.bar.*;
	CONFIG::debug { 
		import foo.bar.Debug; perfUtil.startSampling();
	}
	include 'me.as'
	[Event]
	use namespace mx_internal;
	import last;
	/**
	 * java doc
	 */
	public class /*f*/Blat extends Bat implements foo.bar.Febraz, Goo {
		CONFIG::debug { private var debug:int = 1; }
		private var data1:Vector.<Vector.<String>>;
		private var data:*=womble();

		public function Blat() {
			super();
			return;
		}

		[Annotate]
		[Basic()]
		[String("foo")]
		[Num(1)]
		[Bool(false)]
		[Arg(foo="bar")]
		[List(foo="bar", that=2)]
		[Event("beta")]
		private var x:String = 1;
		override my_namespace static function get foobar():Vector.<String>
		{
			return null;
		}
		/** javadoc? */
		public static function func(arg:Number,arg1:* =undefined, foo=null, ...):Boolean {
			var rsl:Vector.<RSLData> = Vector.<RSLData>(rslDataList[event.rslIndex]);
			CONFIG::debug { 
				var perfUtil:Pref = new my.baz.Pref();
				perfUtil.startSampling();
			}
			default xml namespace = "http://example.com/";
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
			d = <foo bar="{blat}"/>;
			r = /regexp/;
			a = b.(@c);
			zz = a..b;
			zzz = a..@*;
			zzzz = a..@["foo"+b];
			/* unary expressions */
			--a; ++a; a--; a++; a = -a;
			return a.call(i.j*k, l[m]);
		}
	}
} // trailing comment
import me.you.*;
[TestMe]
class Inner { }
function innerFunc():void { return; }

public namespace mx_internal = "http://www.adobe.com/2006/flex/mx/internal";
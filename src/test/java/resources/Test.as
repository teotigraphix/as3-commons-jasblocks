package foo.bar {
	import foo.bar.Goo;
	import foo.boo.*;
	/**
	 * Test desc.
	 */
	[Meta]
	/**
	 * Test desc.
	 */
	[Args(true, value=42, name="my.Event")]
	/**
	 * This is a doc comment for the 
	 * class Baz, see how the line
	 * wraps.
	 * 
	 * <p>Some other stuff here.</p>
	 * 
	 * @author Michael Schmalle
	 * @foo doc tags also
	 * wrap on newlines.
	 * @single 
	 */
	public class Baz extends some.place.Other  implements foo.bar.IPad, foo.goo.IPhone, IPod {
		private var data:*=womble();
		private var data1:Vector.<Vector.<String>>;
		public function Baz() {
			// Call the super
		}
		override function get foobar():Vector.<String> {
			return null;
		}
		/**
		 * Test tg1 meta
		 * description.
		 */
		[Test1]
		/**
		 * Test tg2 meta
		 * description.
		 * @private 
		 */
		[Test2]
		/**
		 * A method that shows a lot
		 * 
		 * @since 1.0
		 */
		public static function func(arg:Number, arg1:*=undefined, foo=null, ...rest):Boolean {
			default xml namespace = "foo/xml/42";
			for (var b:int=1; b<10; b++) {
				bar();
				for (; ; ) {
					if (a > b && c != 42) {
						break;
					}
				}
			}
			for (var g in blah) {
				r();
			}
			for each(var g:Object in baz[goo]) {
				continue;
			}
			if (h == undefined) {
				throw new Error();
			} else {
				// the else block
			}
			while (false) {
				v();
			}
			do {
				continue;
			} while (m < 42);
			switch (blah) {
				case 22:
					return foo();
				case 1:
					if (false) {
					} else {
						break;
					}
				default:
					return foo[bar][baz];
			}
		}
	}
}
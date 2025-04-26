(function ($) {

var defaultOptions = {
		instanceGlobal: 'EasyDnnSolutions1_1_instance',
		google: {
			maps: {
				api: {
					key: '',
					libraries: []
				}
			}
		}
	},
	$window = $(window),

	getExplicitStyleValue = function ($element, styleProperty) {
		var propertyValue = '',
			styleAttribute = $element.attr('style'),
			zIndexStartPosition,
			semicolonPosition;

		if (typeof styleAttribute != 'string')
			return propertyValue;

		zIndexStartPosition = styleAttribute.indexOf(' ' + styleProperty + ':');

		if (zIndexStartPosition == -1) {
			zIndexStartPosition = styleAttribute.indexOf(';' + styleProperty + ':');

			if (zIndexStartPosition == -1) {
				zIndexStartPosition = styleAttribute.indexOf(styleProperty + ':');

				if (zIndexStartPosition != 0)
					return propertyValue;
			} else
				zIndexStartPosition++;
		} else
			zIndexStartPosition++;

		propertyValue = styleAttribute.substr(zIndexStartPosition + styleProperty.length + 1);
		semicolonPosition = propertyValue.indexOf(';');

		if (semicolonPosition == -1)
			return propertyValue.trim();

		propertyValue = propertyValue.substr(0, semicolonPosition).trim();

		return propertyValue;
	};

GoogleHelper = function (parent) {
	var self = this;

	self.parent = parent;
	self.maps = {
		api: {
			loaded: (typeof window.google == 'object' && typeof window.google.maps == 'object'),
			callbacks: []
		}
	}
	self.options = parent.options.google;

	self.public = {
		maps: {
			api: {
				callback: function () {
					var i = 0,
						l = self.maps.api.callbacks.length;

					self.maps.api.loaded = true;

					for (; i < l; i++)
						self.maps.api.callbacks[i]();
				},

				load: function () {
					var tagId = 'eds_googleMapsApi',
						gMapsKey = self.options.maps.api.key,
						script,
						src = 'https://maps.googleapis.com/maps/api/js?v=3.39&callback=' + self.parent.options.instanceGlobal + '.google.maps.api.callback';

					if ($('script#' + tagId, self.parent.$head).length == 0) {
						if (typeof gMapsKey != 'string')
							gMapsKey = '';

						if (gMapsKey != '')
							gMapsKey = '&key=' + gMapsKey;

						script = document.createElement('script');
						script.type = 'text/javascript';
						script.id = tagId;

						if (self.options.maps.api.libraries)
							src += '&libraries=' + self.options.maps.api.libraries.join(',');

						src += gMapsKey;

						script.src = src;

						self.parent.$head[0].appendChild(script);
					}

					return self.parent;
				},

				onLoad: function (toExecute) {
					if (self.maps.api.loaded)
						toExecute();
					else {
						self.maps.api.callbacks.push(toExecute)
						self.public.maps.api.load();
					}

					return self.parent;
				}
			}
		}
	};

	return self.public;
}

window.EasyDnnSolutions1_1 = function (instanceOptions) {
	var self = this;

	self.options = $.extend(true, {}, defaultOptions, instanceOptions);

	self.google = new GoogleHelper(this);
	self.$head = $('html > head');

	$(function () {
		$('body')
			.on('click', '.eds_openModal', function () {
				var $clicked = $(this),
					$modalTarget = $('.eds_modalWrapper')
						.filter(function () {
							return $clicked.data('targetId') == this.id || $(this).hasClass($clicked.data('targetClass'));
						}),
					$dnnModuleElements = $modalTarget.parents('.DnnModule'),
					$modalContent,
					$modalResizeWrapper,
					$modalContentTitle,
					initialHeight,

					resizeContent = function () {
						var windowHeight = $window.height(),
							ContentHDiff = Math.round($modalContent.outerHeight(true) - $modalContent.height()),
							resizeWrapperHDiff = Math.round($modalResizeWrapper.outerHeight(true) - $modalResizeWrapper.height()),
							titleHeight = $modalContentTitle.outerHeight(true),
							maxHeight = windowHeight - ContentHDiff - resizeWrapperHDiff - titleHeight;

						if (maxHeight < initialHeight)
							$modalResizeWrapper.height(maxHeight);
						else
							$modalResizeWrapper.css('height', '');
					};

				$dnnModuleElements.each(function () {
					var $this = $(this);

					$this
						.data('previousZIndex', getExplicitStyleValue($this, 'z-index'))
						.css('z-index', 99999);
				});

				$modalTarget.addClass("eds_modalVisible");
				$("> .eds_modalContent", $modalTarget).addClass("eds_fadeInDown");

				if ($modalTarget.hasClass('eds_resizable')) {
					$modalContent = $('>', $modalTarget);
					$modalContentTitle = $('> h3', $modalContent);
					$modalResizeWrapper = $('> div', $modalContent);

					initialHeight = $modalResizeWrapper.height();

					resizeContent()

					$window.on('resize.eds_modalWrapper', function () {
						resizeContent();
					});
				}
			})
			.on('click', '.eds_modalClose', function () {
				var $clicked = $(this),
					$modalTarget = $('.eds_modalWrapper'),
					$dnnModuleElements = $modalTarget.parents('.DnnModule');

				$dnnModuleElements.each(function () {
					var $this = $(this);

					$this.css('z-index', $this.data('previousZIndex'));
				});

				$modalTarget
					.filter(function () {
						return $clicked.data('targetId') == this.id || $(this).hasClass($clicked.data('targetClass'));
					})
						.removeClass("eds_modalVisible")
						.css('z-index', '');
			});
	});
	}

var initOptions = null;
if ($('#eds_js1_1').length > 0) {
	initOptions = $('#eds_js1_1').data('initJson')
}
if ($('meta[name="eds__GmapsInitData"]').length > 0) {
	initOptions = JSON.parse($('meta[name="eds__GmapsInitData"]').attr("content"));
}

if (window[initOptions.instanceGlobal] == undefined && initOptions != null)
	window[initOptions.instanceGlobal] = new EasyDnnSolutions1_1(initOptions);

})(eds3_5_jq);
